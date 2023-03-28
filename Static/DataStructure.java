package Static;

//목표 : Inner Class 구현하기
public class DataStructure {
	
	static {

		System.out.println("이것이 바로 static block!");
	}
	
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];
	
	public DataStructure() {
		for(int i=0 ; i<SIZE ; i++) {
			arrayOfInts[i] = i;
		}
	}
	
	public void printEven() {
		
		//여기서 this는 DataStructure Class?
		DataStructureIterator iterator = this.new EvenIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}
	
	//interface도 구현이 가능하다.
	interface DataStructureIterator extends java.util.Iterator<Integer> {}
	
	//inner class
	private class EvenIterator implements DataStructureIterator {
		
		{
			System.out.println("이것이 바로 EvenIterator!");
		}
		
		private int nextIndex = 0;
		
		public boolean hasNext() {
			return (nextIndex <= SIZE-1);
		}
		
		public Integer next() {
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
			
			nextIndex += 2;
			return retValue;
		}
		
	}

    public void innerIterator() {

        NextedIterator ni = new NextedIterator();

    }
	
	//static 중첩 클래스
	private static class NextedIterator {
		static {
			System.out.println("이것이 바로 NextedIterator!"); //static 중첩 클래스의 static 블록은 초기에 메모리할당이 되지 않는다.
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("이것이 바로 main 메서드!");
		
		DataStructure ds = new DataStructure();
		ds.printEven();
        ds.innerIterator();
		
		// NextedIterator ni = new DataStructure.NextedIterator(); //static이 아닌 클래스와 같이 호출 시 초기화 작업이 이뤄진다.
	}
	
	//결과값
	//	이것이 바로 static block!
	//	이것이 바로 main 메서드!
	//	이것이 바로 EvenIterator!
	//	0 2 4 6 8 10 12 14 
	//	이것이 바로 NextedIterator!

	
    // 흐름
    // 1. DataStructure.class 로드됨
    // 2. DataStructure의 main 메서드를 호출하기위해 DataStructure 클래스 초기화 진행
    // 3. DataStructure 클래스가 초기화되면서 static block 호출되어 실행됨.
    // 4. main 메서드 호출되어 실행됨.
    // 5. DataStructure 인스턴스 생성되어 printEven() 메서드 호출되어 실행됨.
    // 6. printEven() 메서드가 실행되면서 내부 클래스가 호출되어 EvenIterator 클래스가 로드되고 인스턴스가 생성됨.
	// 7. EvenIterator 클래스의 hasNext()와 next() 메서드가 호출되어 실행됨.
    // 8. innerIterator() 메서드가 실행되면서 정적 내부 클래스가 로드되면서 초기화되어 static 블록이 호출됨.
}

