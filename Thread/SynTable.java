public class SynTable {
    //synchronized() 키워드 사용
    synchronized void printTable(int n) { 
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
