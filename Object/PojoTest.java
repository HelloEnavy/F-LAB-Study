package Object;

//다른 객체와의 관계없이 자신만의 필드값과 getter, setter 메서드만 가지고 있다.
//이러한 객체를 POJO라고 한다.
public class PojoTest {
    
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public void setAge(int age) {
        this.age = age;
    }

}
