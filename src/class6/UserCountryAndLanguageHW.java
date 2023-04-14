package class6;

import java.util.Scanner;

public class UserCountryAndLanguageHW {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of your country.");

        String country= scanner.nextLine();

        if(country.equals("USA") || country.equals("Canada") || country.equals("England")){
            System.out.println("The language you speak is English");
        } else if (country.equals("Mexico") || country.equals("Peru") || country.equals("Puerto Rico")) {
            System.out.println("The language you speak is Spanish.");
        } else if (country.equals("Japan")) {
            System.out.println("Japanese");
        }


    }
}
