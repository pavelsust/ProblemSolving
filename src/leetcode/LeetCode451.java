package leetcode;

public class LeetCode451 {

    public static void main(String[] args) {
        String sentence = "pavelll";
        System.out.println(frequencySort(sentence));
    }

    public static String frequencySort(String s){
        int count=0;
        int previousCount =0;
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<s.length(); i++){
            char value = s.charAt(i);
            for (int j=0; j<s.length(); j++){
                if (value==s.charAt(j)){
                    count++;
                }
            }

            if (previousCount<count){
                previousCount = count;
                count=0;
                for (int k=0; k<previousCount;k++){
                    //System.out.println(value);
                    print(previousCount);
                    sb.insert(0, value);
                }
            }else {
                sb.insert(0,value);
            }
            previousCount = 0;

        }
        return sb.toString();
    }


    public static void print(String value){
        System.out.println(value);
    }
    public static void print(int value){
        System.out.println(value);
    }
}
