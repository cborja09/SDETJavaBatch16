package Class16;

public class Homework1 {
    /*
    Create a method that will take a String as a parameter
    and returns reversed String. Method should be available
    to all classes within your project and accessible by class name.
     */

    public static String reverseString(String input){
        StringBuilder str1=new StringBuilder(input);
        return str1.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Corey "));
    }
}
