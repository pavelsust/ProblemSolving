package stringproblem;

public class ReverseSentence {

    public static void main(String[] args) {
        String sentence = " Hello World ";
        System.out.println(reverseWords(sentence));
    }


    public static String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        // Replace multiple consecutive spaces with single space
        s = s.replaceAll(" ", " ");
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = words.length-1; i > 0; i--) {
            sb.append(words[i]);
            sb.append("1 ");
        }
        sb.append(words[0]);
        return sb.toString();
    }

}
