public interface Vehicle {

    //Default Method 구현.
    //Defulat 메서드는 반드시 구현부도 작성해줘야한다.
    //Default 메서드는 해당 인터페이스를 상속받아 사용이 가능하다.
    public default void doSomething(int n) {
        System.out.println("Default doSomething Method " + n);
    }

    //일반 추상 메서드 구현
    public void doSomething1();

}

