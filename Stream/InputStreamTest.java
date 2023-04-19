package Stream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.*;

//InputStream 구현
public class InputStreamTest {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\gusdk\\Downloads\\InputStreamTextFile.txt");
		
			int c; //읽어온 데이터가 저장될 변수
			
			while((c = fis.read()) != -1) { //읽어올 데이터가 있다면
				
				System.out.print((char)c);
			}
			
			fis.close(); //작업이 완료되면 close() 메서드를 이용하여 닫아준다.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		        
	}

    //결과값
    //This is InputStreamTextFile!
    //text 파일에 적혀있는 문구가 출력되었다
}

