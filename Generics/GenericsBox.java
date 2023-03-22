package Generics;

//제네릭을 사용한 Class
class GenericsBox <T> {

    private Object[] box = new Object[10];

    int cursor = 0;

    void putData(T data) {
        box[cursor++] = data;
    }

    T getData() {
        T data  = (T)box[cursor -1];
        box[cursor - 1] = null;
        cursor--;
        return data;
    }
}
