import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVsLinked {

    public void arrayListTest() {

        long start = System.nanoTime();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0 ; i<500000 ; i++) {
            arrayList.add(i);
        }

        long end = System.nanoTime();

        System.out.println("ArrayList 입력 소요시간 : " + (end-start));

        start = System.nanoTime();

        for(int i=0 ; i<100000 ; i++) {
            arrayList.get(i);
        }

        end = System.nanoTime();

        System.out.println("ArrayList 탐색 소요시간 : " + (end-start));

        start = System.nanoTime();

        for(int i=0 ; i<100000 ; i++) {
            arrayList.remove(i);
        }

        end = System.nanoTime();

        System.out.println("ArrayList 삭제 소요시간 : " + (end-start));

    }

    public void linkedListTest() {
        
        long start = System.nanoTime();

        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i=0 ; i<500000 ; i++) {
            linkedList.add(i);
        }

        long end = System.nanoTime();

        System.out.println("LinkedList 입력 소요시간 : " + (end-start));

        start = System.nanoTime();

        for(int i=0 ; i<100000 ; i++) {
            linkedList.get(i);
        }

        end = System.nanoTime();

        System.out.println("LinkedList 탐색 소요시간 : " + (end-start));

        start = System.nanoTime();

        for(int i=0 ; i<100000 ; i++) {
            linkedList.remove(i);
        }

        end = System.nanoTime();

        System.out.println("LinkedList 삭제 소요시간 : " + (end-start));


    }


    public static void main(String[] args) {
        
        ArrayVsLinked arrayVsLinked = new ArrayVsLinked();

        arrayVsLinked.arrayListTest();
        arrayVsLinked.linkedListTest();

        //결과
        // ArrayList 추가 소요시간 : 12972800
        // ArrayList 탐색 소요시간 : 2349700
        // ArrayList 삭제 소요시간 : 4574597700
        // LinkedList 추가 소요시간 : 12045900
        // LinkedList 탐색 소요시간 : 7775754500
        // LinkedList 삭제 소요시간 : 7954515900

        // 추가 작업 : LinkedList < ArrayList
        // 삭제, 탐색 : LinkedList > ArrayList

    }

}
