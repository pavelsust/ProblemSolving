package stringproblem;

public class PangramsSentence {

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkPangrams(str));
    }

    public static boolean checkPangrams(String s){
        boolean[] marks = new boolean[26];
        int index =0;

        for (int i =0; i< s.length(); i++){
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                index = s.charAt(i)-'A';
            }else if ('a' <=s.charAt(i) && s.charAt(i)<='z'){
                index = s.charAt(i)-'a';
            } else {
                continue;
            }
            marks[index] = true;
        }

        // Return false if any character is unmarked
        for (int i = 0; i < 26; i++)
            if (!marks[i])
                return (false);

        return (true);
    }
}