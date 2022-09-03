package leetcode;

public class LeetCode151 {

    public static void main(String[] args) {
        System.out.println(returnWords("i Love it"));
    }

    public static String returnWords(String s){
        s = s.trim(); // remove leading and trailing space
        s = s.replaceAll(" +", " "); // remove multiple space with single space
        String[] words = s.split(" "); // split sentence according to single space
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i>=0; i--){
            if (i==words.length-1){
                sb.append(words[i]);
            }else {
                sb.append(" ");
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }

}
