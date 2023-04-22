package Spring;

//싱글톤 구현 방법 - Bill Pugh Singleton Implementaion
//inner class를 사용하여 singleton 구현
public class SingletonInner {

    private SingletonInner(){}

    private static class SingletonHelper{
        private static final SingletonInner INSTANCE = new SingletonInner();
    }

    public static SingletonInner getInstance() {
        return SingletonHelper.INSTANCE;
    }
    
    //inner class 같은 경우는
    //SingletonInner 클래스가 로드될 때까지 inner class는 로드되고 있지 않다가
    //get Intance()가 호출되면 inner class가 JVM에 로드되고 인스턴스를 생성함

}
