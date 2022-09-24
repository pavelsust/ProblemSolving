package stringproblem;

import show.Show;

public class InitialName extends Show {
    public static void main(String[] args) {
        findInitialName("Masud Parvez");
    }


    public static void findInitialName(String name){
        if (name.length()==0){
            return;
        }
        System.out.println(Character.toUpperCase(name.charAt(0)));

        for (int i =0; i<name.length(); i++){
            if (name.charAt(i) == ' '){
                System.out.print(" " + Character.toUpperCase(
                        name.charAt(i + 1)));
            }
        }
    }
}

// Java program to print initials of a name
class initials {

    static void printInitials(String name)
    {
        if (name.length() == 0)
            return;

        // Since toupper() returns int,
        // we do typecasting
        System.out.print(Character.toUpperCase(
                name.charAt(0)));

        // Traverse rest of the string and
        // print the characters after spaces.
        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(
                        name.charAt(i + 1)));
    }

    // Driver code
    public static void main(String args[]){
        String name = "Masud Parvez";
        printInitials(name);
    }
}

