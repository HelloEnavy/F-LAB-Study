import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetSyn {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Set setSyn = Collections.synchronizedSet(set); // Set 타입으로 반환하는 메서드이다.
        System.out.println(setSyn); // [1, 2, 3, 4]
    }
}
