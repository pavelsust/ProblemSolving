package stringproblem;

public class StringCopy {

    public static void main(String[] args) {
        String name = "pavel";
        System.out.println(returnCopy(name.toCharArray()));
    }

    public static char[] returnCopy(char[] string1){
        char[] result = new char[string1.length];  // set length of the result

        for (int i =0; i <string1.length; i++){
            result[i] = string1[i];  // copy string1 to result
        }
        return result;
    }
}
