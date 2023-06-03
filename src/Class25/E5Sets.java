package Class25;

import java.util.TreeSet;

public class E5Sets {
    public static void main(String[] args) {

        //TreeSet sorts print out by alphabetical order.Based on the first letter of each word.
        //the data gets sorted
        TreeSet<String>  fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
    }
}
