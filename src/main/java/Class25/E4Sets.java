package Class25;

import java.util.LinkedHashSet;

public class E4Sets {
    public static void main(String[] args) {

        //no duplicates are allowed in LinkedHashSet but it will remember the order
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("kiwi");
        fruit.add("mango");
        fruit.add("orange");
        fruit.add("mango");
        System.out.println(fruit);
    }
}
