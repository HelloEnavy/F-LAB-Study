import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("e");
        hashSet.add("f");
        hashSet.add("x");
        hashSet.add("y");
        hashSet.add("z");
        hashSet.add("ㄱ");
        hashSet.add("ㄴ");
        hashSet.add("ㄷ");
        hashSet.add("ㄹ");

        
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        linkedHashSet.add("e");
        linkedHashSet.add("f");
        linkedHashSet.add("x");
        linkedHashSet.add("y");
        linkedHashSet.add("z");
        linkedHashSet.add("ㄱ");
        linkedHashSet.add("ㄴ");
        linkedHashSet.add("ㄷ");
        linkedHashSet.add("ㄹ");

        Iterator<String> it1 = hashSet.iterator();
        Iterator<String> it2 = linkedHashSet.iterator();
        
        for(;it1.hasNext();) {
            System.out.print(it1.next() + " "); // a b c d e f ㄱ ㄴ ㄷ x y ㄹ z
        }

        System.out.println(" ");

        for(;it2.hasNext();) {
            System.out.print(it2.next() + " "); // a b c d e f x y z ㄱ ㄴ ㄷ ㄹ -> 추가한 순서대로 출력된다.
        }
    }

    //추가로 확인한 점!
    //데이터 타입으로 Integer을 넣고 Integer 타입을 출력하였을 때에는 HashSet도 순서대로 나왔다.
    //Iterator이 알아서 숫자는 정렬시킨 것인가..? 내부 코드를 확인하였을 땐 별다른 코드가 없는뎅..
}
