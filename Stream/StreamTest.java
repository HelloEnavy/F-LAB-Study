package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {
	
	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<Product>();
		
		//Product List에 데이터 추가
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		
        //Stream을 사용하여 List에 담겨있는 필요한 데이터만 추출하여 Set 데이터 타입으로 변환
        Set<Float> productPriceSet = productsList.stream().filter(product -> product.getPrice() < 30000)
        		.map(product -> product.getPrice()).collect(Collectors.toSet());
        
        //1. productsList를 Stream 클래스로 변환
        //*중간연산 */
        //2. filter() : 중간연산 / Stream의 filter 메서드를 이용하여 특정 조건에 맞는 Stream을 반환 (가격이 3만원 이하 상품)
        //3. map() : 중간연산 / 주어진 함수를 적용한 결과 값의 Stream을 반환
        //*최종연산 */
        //4. collect() : 최종연산(터미널작업) / 반환된 Stream을 최종적으로 주어진 타입의 데이터로 분류시킨다. (반환된 데이터들을 Set 타입의 객체 집합으로 변환)
        
        
        System.out.println(productPriceSet);
        //결과값
        //가격이 30000원 미만인 상품을 Set에 담아 반환
        //[25000.0, 28000.0]
			
	}

}

