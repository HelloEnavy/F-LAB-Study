import java.util.ArrayList;

public class RemoveArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.size());

        for(int i=0 ; i<10 ; i++) { //ArrayList는 처음 제공되는 사이즈를 10으로 주기 때문에 10개의 요소를 넣어봤다.
            list.add(i, ""+i+"");
        }

        System.out.println(list.size()); //size = 10

        //요소 하나를 삭제
        list.remove("3");

        System.out.println(list.size()); //size = 9
    }
}
