package array.problem;

public class ArrayRotateToRight {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        arrayRotateToRight(arr , 7);

        for (int i =0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void arrayRotateToRight(int[]array, int n){
        int temp = array[n-1];
        for (int i = n-1 ; i>0 ; i--){
            array[i] = array[i-1];
        }
        array[0] = temp;
    }
}
