package Class24;

import java.util.ArrayList;

public class E13ArrayList {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> names = new ArrayList<>();
        names.add("coke");
        names.add("coffee");
        names.add("water");
        names.add("juice");

        for (int i = 0; i < names.size(); i++) {

            String word=names.get(i);
            if(word.contains("e") || word.contains("a")){
                names.set(i,"water");
            }
        }
        System.out.println(names);


    }
}
