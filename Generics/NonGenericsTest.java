package Generics;

public class NonGenericsTest {
    public static void main(String[] args) {
        //Box 클래스를 각각의 Box 용도에 맞게 사용할 수 있게 된다.
        Box chickenBox = new Box();
        chickenBox.putData(new ChickenBox());
        Box bookBox = new Box();
        bookBox.putData(new BookBox());

        //데이터를 꺼내올 때는?
        ChickenBox chickenBox2 = (ChickenBox)chickenBox.getData();
        BookBox bookBox2 = (BookBox)bookBox.getData();
        //Object 타입으로 return 되기 때문에 형변환을 해줘야 한다.

        //데이터를 넣을 때
        chickenBox.putData(new BookBox());
        //chickenBox에 ChickenBox 타입만 들어가야하는데 BookBox 타입이 들어가는 것도 가능하다.
        //그래서 후에 해당 데이터를 꺼내올 때 ChichenBox로 형변환 시에 에러가 발생하게 된다.
    }
}
