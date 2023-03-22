package Generics;

//Box 클래스를 Object 타입을 사용함으로 추상화하여 Box 클래스를 다양한 클래스에서 사용할 수 있도록 했다.
public class Box {
    
    //아무 타입의 클래스들이 사용할 수 있도록 모든 객체의 조상인 Object 타입으로 객체를 생성했다.
    private Object[] box = new Object[10];
    int cursor = 0;

    void putData(Object chicken) {
        box[cursor++] = chicken;
    }

    Object getData() {
        Object chicken = box[cursor -1];
        box[cursor - 1] = null;
        cursor--;
        return chicken;
    }
}
