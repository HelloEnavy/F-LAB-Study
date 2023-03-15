import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MaxHeapTest {
    public static void main(String[] args) {
	        
		//기본적으로 maxHeap구조이기 때문에 정렬 기준을 반대로 해주는 reverseOrder() 기준을 사용했다.
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		
		maxHeap.offer(1);
        maxHeap.offer(9);
        maxHeap.offer(2);
        maxHeap.offer(5);
        maxHeap.offer(4);
        maxHeap.offer(3);
        maxHeap.offer(6);
        
        Iterator<Integer> it = maxHeap.iterator(); 

        while(it.hasNext()){
            System.out.println(it.next());
        } 
        
//        결과값
//        9
//        5
//        6
//        1
//        4
//        2
//        3
	
	}
    
}
