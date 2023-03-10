//synchronized method test
//1. nonsynchronized
public class Table {
    void printTable(int n) { 
        for(int i=0 ; i<=5 ; i++) {
            System.out.println(n*i);

            try{
                Thread.sleep(400);
            } catch(InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}

