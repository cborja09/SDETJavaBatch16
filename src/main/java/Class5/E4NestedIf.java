package Class5;

import java.util.Scanner;

public class E4NestedIf {
    public static void main(String[] args) {

        /*
        create a variable money store the value 20,000 inside that variable
        write if-else condition if money is greater than 10,000 program should check
        another condition for example it should check what day is today if the day is
        Sunday it should say let's go shopping.
         */
        int money=5000;
        String day="Monday";
        if(money > 10000){
            if(day.equals("Sunday")) {
                System.out.println("Let's go shopping");
            } else{
                System.out.println("Let's wait for Sunday");
            }
        }else {
            System.out.println("Let's save more");

        }

    }
}
