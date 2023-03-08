public class Cloneable_3_2 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr2 = arr1;

        System.out.println(arr1);
        System.out.println(arr2); //같은 주소값을 참조하고 있는 것을 알 수 있다.
        
    }
}