package Class13;

public class Task3 {
    public static void main(String[] args) {

        /*
        Create a String that should be combination of letters, numbers, and special characters. Find out how many
        Alphanumeric(abd AZ 284) characters are there in the String.
         */

        String str="abcefgABCEDGH@@@!!";
        String str1=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
