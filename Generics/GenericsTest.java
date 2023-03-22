package Generics;

//<T>를 사용함으로써 GenericsBox를 사용하는 각 클래스의 용도에 맞게 데이터 타입을 정해줄 수 있다.
public class GenericsTest {
    public static void main(String[] args){

        GenericsBox<ChickenBox> chickenBox = new GenericsBox<>();
        chickenBox.putData(new ChickenBox());

        GenericsBox<BookBox> bookBox = new GenericsBox<>();
        bookBox.putData(new BookBox());

        //데이터를 꺼내올 때는?
        ChickenBox chickenBox2 = chickenBox.getData();
        BookBox bookBox2 = bookBox.getData();
        //이미 인스턴스 생성시 타입을 정해주기 때문에 형변환을 해줄 필요가 없다.

        //데이터를 넣을 때
        //chickenBox.putData(new BookBox());
        //ChickenBox 타입이 아니기 때문에 에러가 발생한다.

    }
}
