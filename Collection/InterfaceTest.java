//인터페이스는 클래스와 다른 것이 상태가 아닌 행위만 갖고 있다.
//인터페이스를 생성할 때는 interface 키워드 사용
public interface InterfaceTest {
    
    //인터페이스는 구현되지 않은, 껍데기만 있는 행위를 갖고 있다.
    public void method();

    //JDK8부터 인터페이스는 추상 메서드외에 static, default 메서드도 가질 수 있게 되었다.
    //static method 
    public static void method1() {System.out.println("인터페이스의 static 메서드");};
    //default method
    default void method2() {System.out.println("인터페이스의 디폴트 메서드");};
}