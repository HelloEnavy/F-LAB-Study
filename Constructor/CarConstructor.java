package Constructor;

public class CarConstructor {

    public String color;
    public int door;
    public int window;

    //매개변수가 없는 기본 생성자
    //별도로 생성자를 만들어주지 않아도 알아서 컴파일러가 만들어주는 생성자이다.
    public CarConstructor(){
        this.color = "black"; //color 앞에 this가 붙어있다. 해당 클래스의 필드값인 것을 알 수 있다.
    }

    //매개변수가 있는 생성자
    public CarConstructor(int door, String color){
        this.door = door; // 즉, 인자값으로 받아온 door 값을 해당 클래스의 필드값인 door로 초기화 시킨다는 것이다. this가 빠져버리면 door = door로 구분이 되지 않을 것이다.
        this.color = color;
    }

    //this() 사용
    public CarConstructor(int door, String color, int window) {
        this(door, color); //this()를 통해 Carconstructor 생성자 중 door, color 값을 인자로 받는 생성자를 불러와 사용하였다.
        this.window = window;   
    }
    
}
