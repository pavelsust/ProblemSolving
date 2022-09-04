package stringproblem;

public class MostFrequentLetter {
    public static void main(String[] args) {
        String sentence = "bbbbaaaadddddd";
        System.out.println(getFrequentLetter(sentence));
    }

    // first start a loop
    // take a letter from the loop
    // start second loop to check maximum count
    // store result in an int value
    // the check again

    public static char getFrequentLetter(String s){
        int count =0;
        char result='a';
        int previousCount = 0;

        for (int i =0; i<s.length(); i++){
            char value = s.charAt(i);

            for (int j=0; j<s.length(); j++){
                if (value==s.charAt(j)){
                    count++;
                }
            }
            if (previousCount<count){
                previousCount = count;
                count =0;
                result = value;
            }
        }
        return result;
    }
}
