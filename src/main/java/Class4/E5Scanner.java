package Class4;


import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        /*
        Scanner is a class(which knows how to take input from the keyboard)
        Scan is a variable ot type of scanner just like we create a variable of type String
        new is a special keyword which creates the object of a class
        Scanner again with ()
        System.in=> means we want to use the scanner class for taking the user input
         */
        // whenever we need to take the input from the user we need this code below
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter your name");
        //Calling the next method to take a String from the user
        String name=scan.next();
        System.out.println("You are amazing "+name);




    }
}
