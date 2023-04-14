package class6;

import java.util.Scanner;

public class UserGradeHW {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your grade.");

        char grade=scanner.next().charAt(0);

        if (grade=='A'){
            System.out.println("A-Excellent.");
        } else if (grade=='B') {
            System.out.println("B-Good.");
        } else if (grade=='C') {
            System.out.println("C-Average.");
        } else if (grade=='D') {
            System.out.println("D-Bad.");
        } else {
            System.out.println("Not acceptable.");
            
        }


    }
}
