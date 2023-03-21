package Polymorphism;

//다형성 문법 확인
// - 자식 클래스 타입 → 부모 클래스 타입
// - 부모 클래스 타입 → 자식 클래스 타입
// - 상속관계가 아닌 클래스 타입끼리의 타입 변환

class Parent {}
class Child extends Parent {}
class Brother extends Parent {}

public class grammar {

    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child1 = new Child();
        Child child2 = new Child();
        Brother brother = null;

        //1. 자식 클래스 타입 -> 부모 클래스 타입
        parent = child1;

        //2. 부모 클래스 타입 -> 자식 클래스 타입
        //child1 = parent; // Type mismatch: cannot convert from Parent to Child 에러
        child1 = (Child)parent; //꼭 표시해주기

        //3 상속 관계가 아닌 클래스끼리의 타입 변환
        // child1 = brother; Type mismatch: cannot convert from Parent to Child 에러 발생

    }
}
