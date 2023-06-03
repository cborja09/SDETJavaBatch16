package Class6;

import java.util.Scanner;

public class IfCalculatorHW {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter first number.");
        int firstNumber= scanner.nextInt();
        System.out.println("Please enter second number.");
        int secondNumber=scanner.nextInt();
        System.out.println("Please enter an operator (+,-,*,/).");
        char operator= scanner.next().charAt(0);

        if (operator=='+'){
            System.out.println(firstNumber+secondNumber);
        } else if (operator=='-') {
            System.out.println(firstNumber-secondNumber);
        } else if (operator=='*') {
            System.out.println(firstNumber*secondNumber);
        } else if (operator=='/') {
            System.out.println(firstNumber/secondNumber);
        }


    }
}
