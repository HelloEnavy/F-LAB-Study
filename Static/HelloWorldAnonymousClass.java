package Static;

public class HelloWorldAnonymousClass {
	
	//내부 인터페이스 선언
	interface HelloWorld {
		public void greet();
		public void greetSomeone(String someone);
	}
	
	public void sayHello() {
		
		//로컬 클래스 
		class EnglishGreeting implements HelloWorld {
			
			String name = "world";
			
			public void greet() {
				greetSomeone(name);
			}			
			
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + someone);
			} 
				
		}
		
		HelloWorld englishGreeting = new EnglishGreeting();
		
        //익명 클래스
        //HelloWorld 인터페이스 구현
		HelloWorld frenchGreeting = new HelloWorld(){
			
			String name = "tout le monde";
			
			public void greet() {
				greetSomeone(name);
			}
			
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + someone);
			}
			
		};
		
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		
	}
	
	public static void main(String[] args) {
		HelloWorldAnonymousClass myApp = new HelloWorldAnonymousClass();
		myApp.sayHello();
	}

    //결과값
    // Hello world
    // Salut Fred

}
