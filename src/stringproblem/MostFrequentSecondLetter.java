package stringproblem;

import show.Show;

public class MostFrequentSecondLetter extends Show {

    public static void main(String[] args) {
        String sentence = "aabbccd";
        char value = findSecondFrequentLetter(sentence);
        if (value!='\0'){
            print("Second "+value);
        } else {
            print("No");
        }
    }

//    public static char findSecondFrequentLetter(String str){
//        int count = 0;
//        int previousCount = 0;
//        char result = 'z';
//
//        for (int i=0; i<str.length(); i++){
//            char value = str.charAt(i);
//            for (int j=0; j<str.length(); j++){
//                if (value==str.charAt(j)){
//                    count++;
//                }
//            }
//            if (previousCount<count){
//                previousCount = count;
//                result = value;
//            }
//            count=0;
//        }
//        return result;
//    }


    public static final int NO_OF_CHARACTER = 256;
    public static char findSecondFrequentLetter(String str){
        int[] count = new int[NO_OF_CHARACTER];
        int first =0;
        int second =0;

        for (int i=0; i<str.length(); i++){
            int value = str.charAt(i);
            count[value] = count[value]+1;
        }

        for (int i=0; i<NO_OF_CHARACTER; i++){
            if (count[i]>count[first]){
                second = first;
                first = i;
            } else if (count[i] > count[second] && count[i]!=count[first]){
                second = i;
            }
        }

        return (char)second;
    }

}
