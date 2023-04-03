package String;

public class StringBuffer {

    public static void main(String[] args) {
		String a = new String("abc");
		
		String c = a + "def";
		
		System.out.println(a==c); //false 반환
		
		StringBuffer aB = new StringBuffer("abc");
		StringBuffer cB = aB.append("def");
		
		System.out.println(aB==cB); //true 반환

        //String은 문자열을 추가 시에는 새로운 객체를 생성하여 새로운 메모리 주소값을 할당받기 때문에 false를 반환하고
        //StringBuffer은 새로운 객체를 추가하는 것이 아닌 기존 문자열 데이터에 값을 수정하는 것이기 때문에 주소값이 동일하다.
		
	}
    
}
