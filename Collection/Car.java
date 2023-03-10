//인터페이스를 상속받은 클래스에서 디폴트 메서드를 사용해보자.
public class Car implements Vehicle {
    public static void main(String[] args) {
        
        Car car = new Car();

        car.doSomething1();

        //default 메서드는 구현하지 않아도 에러가 발생하지 않음.
        //Vehicle 인터페이스를 상속받은 Car 클래스가 Vehicle 디폴트 메서드를 활용할 수 있음
        car.doSomething(1); 
    
    }

    //Vehicle의 일반 추상 메서드를 구현하지 않으면 Vehicle 인터페이스를 상속받은 Car 클래스는 에러가 발생함.
    //에러 메세지 : The type Car must implement the inherited abstract method Vehicle.doSomething1()    
    @Override
    public void doSomething1() {
        System.out.println("꼭 구현해야함");
    }
}
