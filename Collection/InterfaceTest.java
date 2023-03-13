//인터페이스는 클래스와 다른 것이 상태가 아닌 행위만 갖고 있다.
//인터페이스를 생성할 때는 interface 키워드 사용
public interface InterfaceTest {

    //상태
    int a = 1;
    static int b = 2;
    public int c = 3;
    public static final int d = 4;
    
    //private int c = 3;  
    //인터페이스 변수 앞에 private 제어자를 넣으면 에러가 뜨며 다음과 같은 문구가 뜬다.
    //Illegal modifier for the interface field InterfaceTest.c; only public, static & final are permittedJava(33554775)
    //즉 인터페이스 변수는 public, static, final 이여야 한다.
    
    //static int d; //에러 발생!!
    //초기화는 무조건 인터페이스 내에서 해주어야한다.



    //행위
    //인터페이스는 구현되지 않은, 껍데기만 있는 행위를 갖고 있다.
    public void method();

    //JDK8부터 인터페이스는 추상 메서드외에 static, default 메서드도 가질 수 있게 되었다.
    //static method 
    public static void method1() {System.out.println("인터페이스의 static 메서드");};
    //default method
    default void method2() {System.out.println("인터페이스의 디폴트 메서드");};
}