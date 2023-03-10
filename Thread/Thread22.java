public class Thread22 extends Thread {
    SynTable t;

    Thread22(SynTable t) {
        this.t = t;
    }

    public void run() {
        t.printTable(4);
    }
}
