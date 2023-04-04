package Stream;

import java.io.Serializable;

public class Product implements Serializable { //직렬화 구현을 위해 Serializble 인터페이스 상속
	
	public int num;
	public String name;
	public float price;

    public Product(String name, float price) {
		this.name = name;
		this.price = price;
	}
	
	public Product(int num, String name, float price) {
		this.num = num;
		this.name = name;
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}
	
}

