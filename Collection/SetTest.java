import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> lastname = new HashSet<String>();

        lastname.add("Park");
        lastname.add("Choi");
        lastname.add("Lee");
        lastname.add("Ryu");
        lastname.add("Lee");

        System.out.println(lastname);

        //결과값
        //[Lee, Park, Choi, Ryu]
        //결과처럼 중복으로 넣었던 Lee 요소는 하나만 확인되고 add 순서대로 들어가있지 않은게 확인된다.

    }
}
