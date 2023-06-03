package Class13;

public class Homework3 {
    public static void main(String[] args) {

        // How would you check if String is palindrome or not? aba=> true
        // Abbc =>false
        // Palindromes are strings that read the same backwards and forwards.

        String palindrome = "aba";
        palindrome = palindrome.toLowerCase();
        StringBuilder str = new StringBuilder(palindrome);
        str.reverse();
        String newPalindrome = str.toString();
        if (palindrome.equals(newPalindrome)) {
            boolean check = true;
            System.out.println(check);
        } else {
            System.out.println("false");
        }
    }
}
