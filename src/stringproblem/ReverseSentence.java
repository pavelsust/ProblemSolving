package stringproblem;

public class ReverseSentence {

    public static void main(String[] args) {
        String sentence = " Hello World pavel ";
        System.out.println(reverseWords(sentence));
    }

//    public static String reverseWords(String s) {
//        // Trim leading and trailing spaces
//        s = s.trim();
//        // Replace multiple consecutive spaces with single space
//        s = s.replaceAll(" +", " ");  // replace all multiple space with single space
//        String[] words = s.split(" "); // split words according to space
//        StringBuilder sb = new StringBuilder();
//
//        for (int i=words.length-1 ; i>=0;i--){
//            if (i==words.length-1){  // last words insert into first
//                sb.append(words[i]);
//            } else {
//                sb.append(" "); // add space after first word
//                sb.append(words[i]); // add words
//            }
//        }
//        return sb.toString();  // convert StringBuilder to string
//    }


    public static String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll(" +", " ");
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i>=0; i--){
            if (i ==words.length-1){
                sb.append(words[i]);
            }else{
                sb.append(" ");
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }
}


