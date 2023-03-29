package Object;

public class Truck extends Car{ //Inheritance : Car 클래스를 상속받음으로써 Truck이 Car 타입에 속하게 된다.

    public int door;
    public Engine engine; //Composition : Truck이 Engine 클래스를 조합함으로써 Engine 기능을 공유하게 된다.

    public Truck() {

        engine = new Engine();
            
    }

    public void drive() {

        System.out.println("Truck Drive");

    }

    public void engineProblem() {
        engine.engineError(); //조합에 사용된 Engine 클래스의 메서드를 사용함.
    }

    public static void main(String[] args){

        Truck truck = new Truck();

        truck.drive();
        truck.engineProblem();

        // 결과값
        // I have engine.
        // Truck Drive
        // Engine was broken!

    }
}