import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//lock
public class ThreadSynchronized2 extends Thread {
    
    private List<Character> names;
    private String message;
    // shared lock
    private static Lock lock = new ReentrantLock(); //lock 메서드를 사용하기 위해 객체 생성

    public ThreadSynchronized2(List<Character> names, String message) {
        this.names = names;
        this.message = message;
    }

    @Override
    public void run() {
        lock.lock(); //lock() 메서드를 작업이 수행되기전 넣어서 알림.
        try {
            for (int i = 0; i < message.length(); i++) {
                try {
                    // HELLO -> H, E, L, L, O
                    names.add(message.charAt(i));
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(names);
        }finally {
            lock.unlock(); //작업이 끝나면 unlock() 메서드를 호출하여 작업이 끝남을 알림.
        }
    }
}
