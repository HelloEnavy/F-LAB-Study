package Object;

public class HashCodeTest {

    public static void main(String[] args) {

        String a = "100";
        String b = "100";

        System.out.println("a.hashCode : " + a.hashCode());
        System.out.println("b.hashCode : " + b.hashCode());

        System.out.println("a의 hashcode값 == b의 hashcode값 ? : " + (a.hashCode() == b.hashCode()));

        String c = "200";

        System.out.println("c.hashCode : " + c.hashCode());

        System.out.println("c의 hashcode값 == a의 hashcode값 ? : " + (c.hashCode() == a.hashCode()));


    }


}