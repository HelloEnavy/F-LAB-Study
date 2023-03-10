public class UnsynchronizedMethod {
    public static void main(String[] args) {

        Table table = new Table();

        Thread1 thread1 = new Thread1(table);
        Thread2 thread2 = new Thread2(table);

        thread1.start();
        thread2.start();

        //결과값
        //결과값들이 뒤죽박죽이다.
        // 0
        // 0
        // 2
        // 4
        // 8
        // 4
        // 12
        // 6
        // 8
        // 16
        // 10
        // 20

    }
}
