//멀티스레드의 동시성 문제 테스트
public class ConcurrentThread {
    public static void main(String[] args) {
        Count count = new Count();

        for(int i=0 ; i<50 ; i++) {
            new Thread(){
                public void run() {
                    for(int j=0 ; j<100 ; j++) {
                        System.out.println(count.view());
                    }
                }
            }.start();
        }

        //결과값 : 중간에 쌩뚱맞은 값이 들어가있다.
        // 4660
        // 4661
        // 4662
        // 4663
        // 370
        // 4664
        // 4665
        // 4666
        // 4667
        
        // 아래와 같이 짰을 땐 왜 안될까...
        // for(int i=0 ; i<50 ; i++) {
        //     Thread1 thread1 = new Thread1();

        //     thread1.run(count);

        //     thread1.start();
        // }       
    }
}

class Count {
    private int count;

    public int view() {
        return count++;
    }

    public int getCount() {
        return count;
    }
}

class Thread1 extends Thread {
    public void run(Count count) {
        for(int j=0 ; j<100 ; j++) {
            System.out.println(count.view());
        }
    }
}
