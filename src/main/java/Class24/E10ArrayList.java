package Class24;

import java.util.ArrayList;

public class E10ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        names.add("coke");
        names.add("coffee");
        names.add("water");
        names.add("juice");

        names.removeIf(word->word.endsWith("e")); // correct syntax for iterators
        System.out.println(names);
    }
}
