//System.gc() 메서드를 실행했을 때의 시간 측정을 해보자.
public class SystemGCTest_3_2 {
    public static void main(String[] args) {
        
        noSystemGc(); // 결과값 : 내 pc기준으로 100ns로 나온다.

        systemGc(); // 결과값 : 9397800ns


    }

    static void noSystemGc() {
        long startTime = System.nanoTime(); //System.nanoTime() : long 타입으로 나노세컨드(1/1000000000) 단위로 반환함 / System.currentTimeMillis() : 밀리세컨드(1/1000초) 단위로 반환함
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime + "ns");
    }

    static void systemGc() {
        long startTime = System.nanoTime(); 

        System.gc();

        long endTime = System.nanoTime();

        System.out.println(endTime - startTime + "ns"); 
    }
}