package Class16;

import java.util.Scanner;

public class Person {

    private String password;

    static double bankBalance=12000;
    void printPassword(){
        System.out.println(password);
    }

    private static void printBalance90(){
        System.out.println(bankBalance);
    }
    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";
        farwa.printPassword();
        System.out.println(Person.bankBalance);

    }
}
