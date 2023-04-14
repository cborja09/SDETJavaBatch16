package Class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {
        /*
        If we want to take a couple lines from the user we should use nextLine method
         */
        Scanner scanner= new Scanner(System.in);
        String sentence=scanner.nextLine();
        System.out.println(sentence);
    }
}
