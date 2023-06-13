package Lambda;

import java.util.stream.*;

public class LambdaTest2{

	public int number = 1;

	MyInter1 mi1 = () -> {
		return number;
	};


	public static void main(String[] args) {

		LambdaTest2 lt2 = new LambdaTest2();

		System.out.println(lt2.mi1.number());

		//결과값
		//1
	}


}
