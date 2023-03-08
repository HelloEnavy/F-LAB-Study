import java.util.ArrayList;
import java.util.List;

public class SliceThread extends Thread{
    
    private List<Character> names;
    private String message;

    public SliceThread(List<Character> names, String message){
        this.names = names;
        this.message = message;
    }

    @Override
    public void run() {
       for(int i=0; i<message.length(); i++){
           try {
               names.add(message.charAt(i)); //message의 문자열을 하나씩 쪼개서 name에 집어넣는 작업
               Thread.sleep(50);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       System.out.println(names);
    }

    public static void main(String[] args) throws InterruptedException

     {
        
        List<Character> list = new ArrayList<>(); //다형성.. 정리 해야하는데..

        //스레드를 두개 만들어서 동시에 names란 변수에 접근하도록 해보자.
        Thread t1 = new SliceThread(list, "SLICETEST");
        t1.start();

        Thread t2 = new SliceThread(list, "SLICETEST");
        t2.start();


        //join() : main 메서드가 스레드의 작업이 끝날 때까지 기다리게 하는 메서드
        t1.join();
        t2.join();

        // 결과값을 보면 예상했던 SLICETEST와는 다르게 값이 나온다.
        // [S, L, I, I, C, E, T, T, E, S, S, T]
        // [S, L, I, I, C, E, T, T, E, S, S, T]

        // 동시에 여러 스레드가 message라는 변수에 접근하여 name에 추가하였다.
        // 이때 추가하는 작업을 동시에 하다보면 하나씩 slice되어야 하는 작업이 여러번 이뤄져서 name에 추가되어 잘못된 결과를 갖고 오게 되는 것이다.
        // 이때 동기화가 필요하다!

    }
    
}
        


