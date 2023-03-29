package Enum;

public class EnumTest {
    
    public Day day; //enum 타입의 Day

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() { //switch 구문에서 사용할 때 매우 편리하다.
        switch (day) {
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
            
            case MONDAY:
                System.out.println("MONDAY");
                break;   

            case TUESDAY:
                System.out.println("TUESDAY");
                break;                  
                    
            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;
             
            case THURSDAY:
                System.out.println("THURSDAY");
                break;   

            case FRIDAY:
                System.out.println("FRIDAY");
                break;

            case SATURDAY: 
                System.out.println("SATURDAY");
                break;
                        
            default:
                System.out.println("EnumType!");
                break;
        }
    }

    public void index(Day day) {
        System.out.println(day.ordinal());
    }


    public static void main(String[] args){

        System.out.println(new EnumTest(Day.FRIDAY)); 
        
        // 결과값
        // Enum.EnumTest@7d6f77cc
        // Day enum 클래스에 저장된 enum 타입 변수 FRIDAY가 저장된 메모리 공간 주소가 나온다.


        EnumTest day = new EnumTest(Day.MONDAY);

        System.out.println(day.day); 
        // 결과값
        // MONDAY

        day.tellItLikeItIs();
        // 결과값
        // MONDAY

        // MONDAY Enum 타입이 열거된 순서 반환
        day.index(Day.MONDAY);
        // 결과값
        // 1
    
    }
}
