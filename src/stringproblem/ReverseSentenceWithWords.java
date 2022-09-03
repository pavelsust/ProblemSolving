package stringproblem;

public class ReverseSentenceWithWords {

    public static void main(String[] args) {
        String sentence = "I love coding";

        System.out.println(reverseWords(sentence));
        System.out.println(reverseSentenceWithWords(sentence));
    }


    // reverse words
    public static String reverseWords(String s ){
        StringBuilder sb = new StringBuilder();
        for (int i =0 ; i<s.length(); i++){
            sb.insert(0, s.charAt(i));
        }
        return sb.toString();
    }


    // reverse sentence with words and reverse words also
    public static String reverseSentenceWithWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        // Replace multiple consecutive spaces with single space
        s = s.replaceAll(" +", " ");  // replace all multiple space with single space
        String[] words = s.split(" "); // split words according to space
        StringBuilder sb = new StringBuilder();

        for (int i=words.length-1 ; i>=0;i--){
            if (i==words.length-1){  // last words insert into first
                sb.append(reverseWords(words[i]));
            } else {
                sb.append(" "); // add space after first word
                sb.append(reverseWords(words[i])); // add words
            }
        }
        return sb.toString();  // convert StringBuilder to string
    }

}
