package stringproblem;

public class ReverseSentenceWithWords {

    public static void main(String[] args) {
        String sentence = "I love coding";
//        String[] splitSentence = sentence.split(" ");
//        String result = "";
//        for (int i =0 ; i<splitSentence.length; i++){
//            StringBuilder stringBuilder = new StringBuilder(splitSentence[i]);
//            stringBuilder.reverse();
//            result = stringBuilder+" "+result;
//        }
//        System.out.println(result);

        System.out.println(reverseWords(sentence));
    }

    public static String reverseWords(String s) {
        String[] splitSentence = s.split(" ");
        String result = "";
        for (int i =0 ; i<splitSentence.length; i++){
            StringBuilder stringBuilder = new StringBuilder(splitSentence[i]);
            stringBuilder.reverse();
            result = stringBuilder+" "+result;
        }
        return result;
    }
}
