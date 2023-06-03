package Class6;

import java.util.Scanner;

public class SwitchCalculatorHW {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number.");
        int firstNumber= scanner.nextInt();
        System.out.println("Please enter second number.");
        int secondNumber= scanner.nextInt();
        System.out.println("Please enter an operator (+,-,*,/).");
        char operator=scanner.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(firstNumber+secondNumber);
                break;
            case '-':
                System.out.println(firstNumber-secondNumber);
                break;
            case '*':
                System.out.println(firstNumber*secondNumber);
                break;
            case '/':
                System.out.println(firstNumber/secondNumber);
                break;
        }


    }
}
