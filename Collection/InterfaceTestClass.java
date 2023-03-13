public class InterfaceTestClass implements InterfaceTest {

    //InterfaceTest 인터페이스에 추상메서드는 무조건 구현시켜야한다.
    @Override
    public void method() {
        System.out.println("무조건 구현시켜줘야하는 추상 메서드");
    }

    //static과 default 메서드는 구현을 시켜주지 않아도 에러가 나지 않는다.

     //InterfaceTest의 default와 변수값들을 수정해보자.
     @Override
     public void method2() {
         System.out.println("변경이 가능할까??");
     }

    public static void main(String[] args) {

        InterfaceTestClass interfaceTestClass = new InterfaceTestClass();

        System.out.println(interfaceTestClass.a);
        System.out.println(interfaceTestClass.b);
        System.out.println(interfaceTestClass.c);

        interfaceTestClass.method();
        InterfaceTest.method1();
        interfaceTestClass.method2();

    }
}
