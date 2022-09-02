package array.problem;

public class ArrayRotateToLeft {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // array list
        int d = 2; // how much i want to rotate

        // rotate 2 times array
        for (int i = 0 ; i < d ; i++){
            arrayRotateToLeftOneByOne(arr , 7);
        }
        // print the array
        for (int i =0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void arrayRotateToLeftOneByOne(int[] array, int n){
        int temp = array[0];  // first pick the first element from array
        for (int i = 0 ; i <array.length-1 ; i++){ // n-1 cause total array size is 7-1
            array[i] = array[i+1]; // array[0 index ] = array[i+1 index] now I have last one
        }
        array[array.length-1] = temp; // last element will be first element from array
    }
}
