package Class24;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>(); //how to print characters from array list example
        characters.add('D');
        characters.add('E');
        characters.add('W');
        System.out.println(characters);
        System.out.println(characters.indexOf('E')); //checks the index of E

        System.out.println(characters.contains('W')); //checks if W is in array list, true.

        System.out.println(characters.isEmpty()); //checks if array list is empty, which is false since it has characters
        characters.set(1,'H'); //replaces index 1 which is E and replaces with character H
        System.out.println(characters);

    }
}
