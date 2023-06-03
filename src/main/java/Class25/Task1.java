package Class25;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String>aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedList<String> names=new LinkedList<>(aList);
        System.out.println(names);
    }
}
