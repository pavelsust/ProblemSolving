package stringproblem;

public class ReplaceString {

    public static void main(String[] args) {
        String name = "pavel";
        int replaceIndex = 3;
        char replaceChar = '1';


        // using normal approach
        String result = name.substring(0, replaceIndex) +replaceChar+name.substring(replaceIndex+1);
        System.out.println(result);

        // Using String Builder
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.setCharAt(replaceIndex , replaceChar);
        System.out.println(stringBuilder);

        // Using String Buffer

        StringBuffer stringBuffer = new StringBuffer(name);
        stringBuffer.setCharAt(replaceIndex , replaceChar);
        System.out.println(stringBuffer);
    }
}
