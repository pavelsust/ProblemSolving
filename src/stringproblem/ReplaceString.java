package stringproblem;

public class ReplaceString {

    public static void main(String[] args) {
        String name = "pavel";
        int replaceIndex = 3;
        char replaceChar = '1';

        // .insert(index, string)  will insert a string into index
        // .charAt(index , char) will replace char into index


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



        StringBuilder sb = new StringBuilder("hello");
        for (int i =0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(sb.length()-1-i);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
    }
}
