package Class24;

import java.util.ArrayList;

public class E7ArrayList {
    public static void main(String[] args) {

        ArrayList<String> grocery=new ArrayList<>();
        grocery.add("nail polish");
        grocery.add("lipstick");
        grocery.add("blush");
        grocery.add("Apple");
        grocery.add("Banana");

        ArrayList<String> fruit= new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        System.out.println(grocery);
        grocery.remove("Apple");
        grocery.remove("Banana");
        grocery.removeAll(fruit); // removes all fruit from array list
        System.out.println(grocery);


    }
}
