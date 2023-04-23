package Class12;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        /*
        Write a program that reads two people's first
        names and if they are expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Mom's first name?");
        String wife= scanner.nextLine();
        System.out.println("Dad's first name?");
        String husband=scanner.nextLine();
        System.out.println("Boy or girl?");
        String gender=scanner.nextLine();

        if (gender.equals("boy")){
            System.out.println("Suggested baby name: Danry");
        }else{
            System.out.println("Suggested baby name: MAIEL");
        }

    }
}
