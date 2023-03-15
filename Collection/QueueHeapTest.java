import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueHeapTest {
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(1);
        minHeap.offer(3);
        minHeap.offer(2);
        minHeap.offer(5);
        minHeap.offer(9);
        minHeap.offer(7);
        minHeap.offer(6);

        Iterator<Integer> it = minHeap.iterator(); 

        while(it.hasNext()){
            System.out.println(it.next());
        } 
        //결과값
        //1
        //1
        //2
        //3
        //5

        //why??
        //hasNext() 메서드 자체가 읽어올 다음 요소가 있는지 확인 후 있으면 next()를 통해 갖고 오는 방식이다.
        //하지만 가장 마지막 노드들은 자식 노드를 갖고 있지 않을 것이기 때문에 false가 나오는 것 같다.
        //근데 왜 1이 중복으로 나올까!?!?!?!?!
        



    }
}
