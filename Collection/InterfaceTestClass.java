public class InterfaceTestClass implements InterfaceTest {

    //InterfaceTest 인터페이스에 추상메서드는 무조건 구현시켜야한다.
    @Override
    public void method() {
        System.out.println("무조건 구현시켜줘야하는 추상 메서드");
    }

    //static과 default 메서드는 구현을 시켜주지 않아도 에러가 나지 않는다.

    //InterfaceTest의 default 메서드를 오버라이딩해보자
    @Override
    public void method2() {
        System.out.println("변경이 가능할까??"); //가능하다.
    }

    public static void main(String[] args) {

        InterfaceTestClass interfaceTestClass = new InterfaceTestClass();

        System.out.println(interfaceTestClass.a);
        System.out.println(interfaceTestClass.b);
        System.out.println(interfaceTestClass.c);

        //여기서 a 값에 새로운 값을 넣으려고 하면 에러가 뜬다.
        //a는 static이며 final 이기 때문에 변경할 수 없다.
        //interfaceTestClass.a = 2;

        interfaceTestClass.method();
        InterfaceTest.method1();
        interfaceTestClass.method2();

        // 실행 결과
        // 1
        // 2
        // 3
        // 무조건 구현시켜줘야하는 추상 메서드
        // 인터페이스의 static 메서드
        // 변경이 가능할까??


    }
}
