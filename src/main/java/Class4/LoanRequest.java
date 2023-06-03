package Class4;

import java.util.Scanner;

public class LoanRequest {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the loan amount you want to borrow.");

        int loan= scanner.nextInt();
        if (loan<=200000){
            System.out.println("Congratulations your loan is approved!");
        } else {
            System.out.println("Unfortunately your loan was not approved!");
        }

    }
}
