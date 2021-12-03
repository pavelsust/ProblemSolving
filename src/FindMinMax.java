public class FindMinMax {

    public static void main(String[] args) {
        int[] array = {1,2 ,3, 4, 5, 100};
        System.out.println(findMax(array));
        System.out.println(findMin(array));
    }

    public static int findMax(int[] array){
        int result=0; // initial result is 0

        for (int i = 0 ; i<array.length ; i++){
            if (result <= array[i]) {   // checking result is small if small then result will the next one
                result = array[i]; //change the result
            }
        }
        return result; // return result
    }
    public static int findMin(int[] array){
        int result= 999999; // pick the bigger one so that we can compare with others

        for (int i = 0 ; i<array.length ; i++){
            if (result >= array[i]) {
                result = array[i];
            }
        }
        return result;
    }
}
