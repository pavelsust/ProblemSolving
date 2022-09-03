package stringproblem;

public class ReverseString {

    public static void main(String[] args) {
        String name = "pavel";

        StringBuilder stringBuilder = new StringBuilder();  // get String Builder
        for (int i=0; i<name.length(); i++){
            stringBuilder.insert(0, name.charAt(i)); // insert character into stringBuilder
            System.out.println(name.charAt(i));
        }
        System.out.println(stringBuilder); // Show String



        StringBuilder test = new StringBuilder();
        test.insert(0, '1'); /// [1]
        test.insert(0, '2'); // [2,1]
        test.insert(0, '3'); // [3,2,1]

        System.out.println(test);

        // using normal approach
        char[] characterArray = getWordList(name); // get name char array list
        String result = "";  // result
        for (int i = characterArray.length-1; i>=0; i--){
           result = result+characterArray[i];  // set result first then replace char
        }
       System.out.println(result);  // print char
    }


    // get char array list
    public static char[] getWordList(String value){
        return value.toCharArray();
    }
}
