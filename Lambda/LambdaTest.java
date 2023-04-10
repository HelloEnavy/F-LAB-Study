package Lambda;

public class LambdaTest {
	
	//익명클래스 사용
	MyInter mi = new MyInter() {

        public int num;
		
		public void MyInterMethod() {
			
			System.out.println("MyInterMethod 구현");
			
		}	
		
	};
	
	
	//람다 사용
	MyInter mi1 = () -> {

		//구현하는 메서드의 이름을 적어주지 않아도 된다. -> 단일 인터페이스의 구현만 가능하다는 것을 알 수 있다.
		System.out.println("Lamda를 사용하여 MyInterMethod 구현");
	};

	// Product p = new Product("milk", 500f);

	// int price = () -> p.getPrice();
	

	public static void main(String[] args) {
		
		LambdaTest lt = new LambdaTest();
		
		lt.mi.MyInterMethod();
		lt.mi1.MyInterMethod();

		
		
			
	}
	
	//결과값
	//MyInterMethod 구현
	//Lamda를 사용하여 MyInterMethod 구현

}
