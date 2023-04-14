package Class4;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("What is the name of your city?");
        String city= scanner.nextLine();
        System.out.println("What is the current temperature today in your city?");
        int temperature= scanner.nextInt();
        temperature=(temperature-32)*5/9;
        System.out.println("The temperature in " +city+ " is " +temperature+ " celsius today.");



    }
}
