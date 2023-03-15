import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueHeapTest {
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(1);
        minHeap.offer(9);
        minHeap.offer(2);
        minHeap.offer(5);
        minHeap.offer(4);
        minHeap.offer(3);
        minHeap.offer(6);

        Iterator<Integer> it = minHeap.iterator(); 

        while(it.hasNext()){
            System.out.println(it.next());
        } 
        //결과값
        // 1
        // 4
        // 2
        // 9
        // 5
        // 3
        // 6



    }
}
