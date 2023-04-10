package Stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
	
	public static void main(String[] args) {
		
		try {
			
			//Serializble 인터페이스를 구현하는 Product 객체.
			Product product = new Product("Phone", 28000f);
			
			//Txt 포맷으로 객체를 변환함
			FileOutputStream fout = new FileOutputStream("C:\\Users\\gusdk\\Downloads\\fout.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(product);
			out.flush();
			
			out.close();
			fout.close();
			
			System.out.println("success");
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		
		//결과값
		//fout.txt 파일에 Product 객체에 대한 정보가 추가되었음.
		
		
	}

}

