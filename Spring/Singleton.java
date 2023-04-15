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
    
}
