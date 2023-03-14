import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {
        
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(7);

        SortedSet<Integer> sortedSet = new TreeSet<>(hashSet);

        System.out.println(sortedSet); // [1, 3, 5, 7, 10] 정렬된 결과로 나왔다.

    }
    
}
