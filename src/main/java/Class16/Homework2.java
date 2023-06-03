package Class16;

public class Homework2 {
    /*
    Create a method that will accept a String as a parameter
    and return a new String that consist only of vowels.
    Method should be available inside the class only where
    it was declared and executed by calling it is named
     */

    private static String vowels(String input){
        input=input.replaceAll("[^aeiou]","");
        return input;
    }

    public static void main(String[] args){
        System.out.println(Homework2.vowels("Kauai"));

    }
}
