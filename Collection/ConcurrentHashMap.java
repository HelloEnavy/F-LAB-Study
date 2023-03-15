//ConcurrentHashMap put() 메서드를 통해 동기화 방식 정리
//https://yeoonjae.tistory.com/entry/Java-ConcurrentHashMap%EC%97%90-%EB%8C%80%ED%95%B4-%EC%95%8C%EC%95%84%EB%B3%B4%EC%9E%90%EC%9E%91%EC%84%B1%EC%A4%91 참고

public class ConcurrentHashMap {
    
    //1. ConcurrentHashMap에 key, value 데이터를 추가하면 putVal 메서드로 넘김
    public V put(K key, V value) {
        return putVal(key, value, false);
    }
    
    
    /** Implementation for put and putIfAbsent */
    final V putVal(K key, V value, boolean onlyIfAbsent) {
        
        //key나 value가 null값이면 에러 처리 -> null을 허용하지 않음
        if (key == null || value == null) throw new NullPointerException();
        
        //HashTable과 마찬가지로 hashcode 함수를 통해 hash 생성
        int hash = spread(key.hashCode());

        int binCount = 0;

        for (Node<K,V>[] tab = table;;) {
            Node<K,V> f; int n, i, fh; K fk; V fv;

            if (tab == null || (n = tab.length) == 0)
                tab = initTable();

            // 새로운 데이터를 삽입하기 전에 hash값을 통해 해당 bucket이 비어있는지 확인
            else if ((f = tabAt(tab, i = (n - 1) & hash)) == null) {
                //비어있으면 새로운 데이터 노드 생성하여 삽입
                if (casTabAt(tab, i, null, new Node<K,V>(hash, key, value)))
                    break;                   // no lock when adding to empty bin
            }

            else if ((fh = f.hash) == MOVED)
                tab = helpTransfer(tab, f);
            else if (onlyIfAbsent 
                     && fh == hash
                     && ((fk = f.key) == key || (fk != null && key.equals(fk)))
                     && (fv = f.val) != null)
                return fv;

            //만약 null이 아니라면 synchronized 블럭을 사용하여 lock을 건다.    
            else {
                V oldVal = null;
                synchronized (f) {
                    if (tabAt(tab, i) == f) {
                        if (fh >= 0) {
                            binCount = 1;
                            for (Node<K,V> e = f;; ++binCount) {
                                K ek;
                                //그리고 HashTable과 같이 새로운 값으로 대치시킨다.
                                if (e.hash == hash &&
                                    ((ek = e.key) == key ||
                                     (ek != null && key.equals(ek)))) {
                                    oldVal = e.val;
                                    if (!onlyIfAbsent)
                                        e.val = value;
                                    break;
                                }
                                Node<K,V> pred = e;
                                if ((e = e.next) == null) {
                                    pred.next = new Node<K,V>(hash, key, value);
                                    break;
                                }
                            }
                        }
                        else if (f instanceof TreeBin) {
                            Node<K,V> p;
                            binCount = 2;
                            if ((p = ((TreeBin<K,V>)f).putTreeVal(hash, key,
                                                           value)) != null) {
                                oldVal = p.val;
                                if (!onlyIfAbsent)
                                    p.val = value;
                            }
                        }
                        else if (f instanceof ReservationNode)
                            throw new IllegalStateException("Recursive update");
                    }
                }
                if (binCount != 0) {
                    if (binCount >= TREEIFY_THRESHOLD)
                        treeifyBin(tab, i);
                    if (oldVal != null)
                        return oldVal;
                    break;
                }
            }
        }
        addCount(1L, binCount);
        return null;
    }

}
