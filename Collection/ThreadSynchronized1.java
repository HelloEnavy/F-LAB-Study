import java.util.List;

//synchronization block
public class ThreadSynchronized1 extends Thread{

    private List<Character> names;
    private String message;

    public ThreadSynchronized1(List<Character> names, String message){
        this.names = names;
        this.message = message;
    }

    @Override
    public void run() {
       synchronized (names){ //synchronized에 수행되는 메서드를 넣었다.
           for(int i=0; i<message.length(); i++){
               try {
                   // HELLO -> H, E, L, L, O
                   names.add(message.charAt(i));
                   Thread.sleep(50);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           System.out.println(names);
       }
    }
    
}