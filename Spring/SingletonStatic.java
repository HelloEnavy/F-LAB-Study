package Spring;

//싱글톤 구현 방법 - Static Block Initialization
//Eager Initialization 방법 + static block Exception 예외처리
public class SingletonStatic {

    private static SingletonStatic instance;

    private SingletonStatic(){}

    static {

        try{

            instance = new SingletonStatic();

        } catch(Exception e) {
            throw new RuntimeException("Exception");
        }
    }

    public static SingletonStatic getInstance() {
        return instance;
    }
    
}
