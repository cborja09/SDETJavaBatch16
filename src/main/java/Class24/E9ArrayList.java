package Class24;

import java.util.ArrayList;

public class E9ArrayList {
    //create an array list of words. remove every word that ends with "e".
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("coke");
        names.add("coffee");
        names.add("water");
        names.add("juice");

        for(String word:names){
            if(word.endsWith("e")){
               names.remove(word);
            }
        }
    }
}
