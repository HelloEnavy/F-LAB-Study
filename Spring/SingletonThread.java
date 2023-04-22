package Spring;

//싱글톤 구현 방법 - Thread Safe Singleton
//Lazy Initialization의 멀티 스레드 환경의 문제를 해결하기 위한 방법
//getInstance()에 synchronized 키워드 사용
public class SingletonThread {
    
    private static SingletonThread instance;

    private SingletonThread(){}

    public static synchronized SingletonThread getInstance() {

        if(instance == null) {
            return instance = new SingletonThread();
        }

        return instance;

    }
}
