//경쟁 상태 구현
//num을 1씩 올리는 과정을 1000번하는 스레드를 동시에 실행시켜보자.
//num이 순차적으로 1씩 올라갈 것 같지만 아니다.
public class RaceConditionTest extends Thread{

    int num = 0;

    public void run(){
        for(int i=0 ; i<1000 ; i++){
            num++;
            System.out.println(num);
        }

    }

    public static void main(String[] args) throws InterruptedException{

        RaceConditionTest raceConditionTest = new RaceConditionTest();

        Thread thread1 = new Thread(raceConditionTest);
        Thread thread2 = new Thread(raceConditionTest);
        
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        //결과값
        //중간에 과정들을 보면 순차적으로 더해지지 않음을 알 수 있다.
        // 1966
        // 1974
        // 1973
        // 1976
        // 1977
        // 1978
        // 1975
        // 1980
        // 1981
        // 1979
        // 1983

        // 바로 여러 스레드가 num이란 공유 변수에 동시에 개입하여 ++연산작업을 수행했기 때문에 나오는 경쟁 상태이다.

    }
}
