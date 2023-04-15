package Spring;

//inner class를 사용하여 singleton 구현
public class Singleton {

    private Singleton(){}

    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    
    //inner class 같은 경우는 클래스가 로드될 때 객체가 생성되기 때문에 멀티스레드 환경에서 안전하다.
}
