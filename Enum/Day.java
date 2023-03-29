package Enum;

public enum Day {

    // 서로 연관된 고정값을 enum type으로 선언해줌.
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;

    private Day() {} //Enum 클래스는 private 생성자만 가질 수 있다.
    
}
