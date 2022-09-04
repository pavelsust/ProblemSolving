package stringproblem;

import show.Show;

public class FindOddPositionSum extends Show {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 5};
        print(getOddPositionSum(array));
    }

    // start a loop
    // take odd position item
    // add to result

    public static int getOddPositionSum(int[] array){
        int result = 0;
        for (int i =0; i <array.length; i = i+2){
            result = result+array[i];
        }
        return result;
    }
}
