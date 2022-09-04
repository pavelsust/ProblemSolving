package leetcode;

public class LeetCode347 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k=2;
        returnFrequentNumber(nums , k);
    }

    public static int[] returnFrequentNumber(int[] array, int k){
        int count =0;
        int previousCount = 0;
        int[] result = new int[array.length];
        int[] finalResult = new int[k];

        for (int i =0; i<array.length; i++){
            int value = array[i];
            for (int j=0; j<array.length; j++){
                if (value==array[j]){
                    count++;
                }
            }

            if (previousCount<count){
                result[i] = value;
                count=0;
            }
        }

        for (int i =0; i<k; i++){
            finalResult[i] = result[i];
        }

        for (int i=0; i<finalResult.length; i++){
            System.out.println(finalResult[i]);
        }
        return finalResult;
    }
}
