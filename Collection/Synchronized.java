import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Synchronized {
    
    public static void main(String[] args) {
        
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        list.add("Let's ");
        list.add("Collections.");
        list.add("Synchronized");

        synchronized(list) {

            Iterator it = list.iterator();

            while(it.hasNext())
                System.out.println(it.next());
        }
    }
}
