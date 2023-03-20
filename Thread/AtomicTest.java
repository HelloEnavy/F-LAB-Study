//Atomic 클래스로 구현해보기

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest extends Thread{

    //Integer 타입의 num값을 0으로 초기화
    AtomicInteger num = new AtomicInteger(0);

    public void run() {
        for(int i= 0 ; i<1000 ; i++) {
            //값을 1만큼 올려주는 메서드
            num.incrementAndGet();

            System.out.println(num.get());
        }
    }
    
    public static void main(String[] args) throws InterruptedException{

        AtomicTest atomicTest = new AtomicTest();

        Thread thread1 = new Thread(atomicTest);
        Thread thread2 = new Thread(atomicTest);
        
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        //결과값
        //이전과 다르게 순차적으로 더해진 것이 확인된다.
        // 1966
        // 1967
        // 1968
        // 1969
        // 1970
        // 1971
        // 1972
        // 1973
        // 1974
        // 1975
        // 1976
        // 1977
        // 1978
        // 1979
        // 1980
        // 1981
    }
    
}