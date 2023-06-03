package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Farwa");
        names.add("Farwa");
        System.out.println(names);

        //HashSet does not allow duplicates and does not remember insertions order
        //There is no get methods in sets
        //You can use enhanced for loops
        HashSet<String> uniqueNames=new HashSet<>();
        uniqueNames.add("Yellow");
        uniqueNames.add("Yellow");
        uniqueNames.add("Green");
        System.out.println(uniqueNames);
        for(String name:uniqueNames){
            System.out.println(name);
        }
    }
}
