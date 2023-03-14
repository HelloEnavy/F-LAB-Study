import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack); //결과값 : [1, 2, 3]

        stack.pop();
        System.out.println(stack); //결과값 : [1, 2] -> 가장 마지막에 넣은 데이터가 삭제되었다.


        stack.clear();
        System.out.println(stack); //결과값 : []
        
    }
}
