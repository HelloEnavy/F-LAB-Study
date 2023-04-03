package String;

import java.util.GregorianCalendar;

public class StringTest {

	public static void main(String[] args) {
		
		//gc 를 실행시켜 메모리 공간을 정리
		System.gc(); 
		
		//소요시간을 알기위해
		long start = new GregorianCalendar().getTimeInMillis(); 
		//소요된 메모리를 알기위해 //freeMemory 메서드는 JVM의 free memory의 양을 반환하는 메서드이다.
		long startMemory = Runtime.getRuntime().freeMemory(); 
		
		
		//StringBuffer sb = new StringBuffer();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ; i<10000000 ; i++) {
			sb.append(":").append(i);
		}
		
		long end = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		
		System.out.println("Time Taken : " + (end-start));
		System.out.println("Memory used : " + (startMemory - endMemory));
		
		//1. StringBuffer 
		//Time Taken : 355
		//Memory used : 2786272
		
		//2. StringBuilder
		//Time Taken : 242
		//Memory used : 2797992
		
		//->StringBuilder가 성능적으로 더 좋다.
		
	}

}

