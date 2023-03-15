package Constructor;

public class ConstructorTest {

    public static void main(String[] args) {
        CarConstructor carConstructor = new CarConstructor();
        System.out.println(carConstructor.color); // black -> CarConstructor 객체가 생성되면서 생성자에서 설정한 값으로 초기화 된 것이 확인된다.

        //생성자 호출 과정
        //1.연산자 new에 의해서 메모리 힙에 Carconstructor 클래스의 인스턴스가 생성된다.
        //2.생성자 Carconstructor() 호출되어 수행되면서 color 값이 설정된다.
        //3.연산자 new에 의해서 생성된 Carconstructor 인스턴스의 주소가 반환되어 참조변수 carConstructor에 참조한다.

        CarConstructor carConstructor2 = new CarConstructor(2, "white"); //매개변수가 있는 생성자를 통해 인스터스 생성 시 기본 door의 갯수와 color를 설정한다.
        System.out.println(carConstructor2.door); //2
        System.out.println(carConstructor2.color); //white
    }
}
