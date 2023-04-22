package Spring;

//싱글톤 구현 방법 -  Eager Initialization
//클래스 로딩 단계에서 클래스의 인스턴스를 생성함
//클래스 로딩은 Java 프로젝트가 실행될 때 딱 한번 이뤄지므로 인스턴스도 1개만 생성됨
public class SingletonEager {
    
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance() {
        return instance;
    }
}
