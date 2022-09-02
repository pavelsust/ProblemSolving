package array.problem;

public class TestMin {

    public static void main(String[] args) {
        int[]array = {1, 2, 3, 50, 100};

        //System.out.println(findMin(array));

//        for (int i =0; i<2 ; i++){
//            rotateLeft(array);
//        }
//
//        for (int i =0 ; i<array.length; i++){
//            System.out.println(array[i]);
//        }
//

        for (int i = 0 ; i<2 ; i++){
            rotateRight(array);
        }

        for (int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int findMin(int[] array){
        int minValue = 999999;
        for (int i =0 ; i<array.length ; i++){
            if (minValue>array[i]){
                minValue = array[i];
            }
        }
        return minValue;
    }


    /*
     1 -> take first element
     2 -> push to last
     */

    public static void rotateLeft(int[] array){
        int firstElement = array[0];
        for (int i =0; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = firstElement;
    }

    public static void rotateRight(int[] array){
        int lastElement = array[array.length-1];
        for (int i =array.length-1 ; i>0; i--){
            array[i] = array[i-1];
        }
        array[0] = lastElement;
    }
}
