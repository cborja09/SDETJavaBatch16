package Class4;

import java.util.Scanner;

public class DmvLicense {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to DMV, what is your age?");

        int age= scanner.nextInt();
        if (age>=18){
            System.out.println("Good news, DMV can issue you a drivers license!");
        } else {
            System.out.println("Unfortunately, DMV can only issue you a learners permit.d");

        }
    }
}
