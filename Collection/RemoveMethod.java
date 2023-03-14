public class RemoveMethod {
    // 1. Object로 삭제
    public boolean remove(Object o) {  
        final Object[] es = elementData;  
        final int size = this.size;  
        int i = 0;  
        found: {  
            //Object의 값이 null인 경우
            if (o == null) {  
                for (; i < size; i++)  
                    if (es[i] == null)  
                        break found;  
                    
            //Object의 값이 null이 아닌 경우
            } else { 
                for (; i < size; i++)  
                    if (o.equals(es[i]))  
                        break found;  
            }  
            return false; 
        }  

        // 요소와 index를 fastRemove에 넘김
        fastRemove(es, i);  
        return true;
    }

    private void fastRemove(Object[] es, int i) { 
        modCount++;  
        final int newSize;  
        //제거된 index부터 마지막까지의 데이터 요소값을 복사하여 arraycopy 메서드를 통해 새로운 배열에 넣음
        if ((newSize = size - 1) > i)  
            System.arraycopy(es, i + 1, es, i, newSize - i); 
        //배열의 마지막 값을 null로 바꾼다.    
        es[size = newSize] = null;  
    }


    @HotSpotIntrinsicCandidate  
    public static native void arraycopy(Object src,  int  srcPos,  
                                        Object dest, int destPos,  
                                        int length); RemoveMethod {
        
    }

    //2. index로 삭제
    public E remove(int index) {  
        //index를 받아와 해당 인덱스에 저장되어있는 Object를 찾아옴
        Objects.checkIndex(index, size);  
        final Object[] es = elementData;  
    
        @SuppressWarnings("unchecked") E oldValue = (E) es[index];  
        //동일하게 fastRemove() 메서드로 인덱스와 데이터를 넘김
        fastRemove(es, index);  
      
        return oldValue;  
    }
}
