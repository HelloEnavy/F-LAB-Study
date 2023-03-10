public class SynchronizedMethod {
    public static void main (String[] args) {

        SynTable table = new SynTable();

        Thread11 thread11 = new Thread11(table);
        Thread22 thread22 = new Thread22(table);

        thread11.start();
        thread22.start();

        //결과값
        //thread11, thread22 순차적으로 진행된 것이 확인된다.
        // 0
        // 2
        // 4
        // 6
        // 8
        // 10
        // 0
        // 4
        // 8
        // 12
        // 16
        // 20

    }
}
