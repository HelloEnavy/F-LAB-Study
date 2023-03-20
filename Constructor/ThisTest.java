package Constructor;

package flab;

//생성자 테스트
//목적 : this와 this()를 생성자 외에도 다른 메서드에서도 호출이 가능한지 확인
//예상 : this는 가능하지만 this()는 객체 생성될 때만 호출되는 생성자를 호출하는 것이기 때문에 그 이후에 호출되는 생성자 외 메서드에서는 당연히 호출이 불가할 것이다.
//결과 : this는 호출되지만 this()는 Constructor call must be the first statement in a constructor 에러가 뜸.
public class ThisTest {
	
	private int number;
	
	public ThisTest() {};
	
	public ThisTest(int number) {
		this.number = number;
	}
	
	
	public void test(int number) {
		
		this.number = number;
		
		System.out.println(this.number);
	}
	
	public void test2(int number) {

		//this(number); //역시나 에러 발생!!
		
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
		ThisTest thisTest = new ThisTest();
		
		ThisTest thisTest1 = new ThisTest(100);
		
		System.out.println("thisTest : " + thisTest.number);
		
		System.out.println("thisTest1 : " + thisTest1.number);
		
		thisTest.test(100);
		thisTest1.test(100);
		
		//결과값
//		constructorTest : 0
//		constructorTest1 : 100
//		100
//		100

	}

}

