public class Array_3_2 {
    public static void main(String[] args) {
        
        //1. 배열 선언
        int[] arr1;
        int arr2[];

        //2. 배열 생성
        arr1 = new int[5];
        arr2 = new int[5];

        //배열 호출
        System.out.println(arr1); //출력값 : [I@48cf768c

        System.out.println(arr2[3]); //출력값 : 0

        //3. 배열 초기화
        arr1 = new int[]{1, 2, 3, 4, 5}; 
        //이 방법은 new 연산자를 사용하여 새로운 배열을 생성 후 안에 요소까지 넣어주는 작업이다.
        //그렇기 때문에 arr1은 기존에 참조하고 있던 주소값이 아닌 새로 생성된 주소을 참조하게 된다.

        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

    }
    
}