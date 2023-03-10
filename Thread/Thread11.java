public class Thread11 extends Thread {
    SynTable t;

    Thread11(SynTable t) {
        this.t = t;
    }

    public void run() {
        t.printTable(2);
    }
}
