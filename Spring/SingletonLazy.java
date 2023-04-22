package Spring;

//싱글톤 구현 방법 - Lazy Initialization
//getInstance() 메서드를 호출하는 경우에만 인스턴스 생성
//이미 생성된 인스턴스가 있으면 그 인스턴스를 반환하는 방법
public class SingletonLazy {
    
    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance() {

        if(instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }

}
