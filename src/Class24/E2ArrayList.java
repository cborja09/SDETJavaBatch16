package Class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(100);
        numbers.add(200);
        System.out.println(numbers);

        for(Integer num:numbers){ //can also use this enhanced for loop to get the same result as above with the .add methods
            System.out.println(num); // enhanced for loop is preferred.
        }
        System.out.println("************");

        for (int i = 0; i < numbers.size(); i++) { // normal for loop to get the elements in array list
            System.out.println(numbers.get(i));
        }
        System.out.println("************");

        int i=0; // using while loop to print the same elements from the array list
        while(i< numbers.size()){
            System.out.println(numbers.get(i));
            i++;
        }
        System.out.println("************");

        int j=0; // using a do while loop to print the same elements from the array list
        do{
            System.out.println(numbers.get(j));
            j++;
        }while(j<numbers.size());
    }
}
