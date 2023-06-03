package Class25;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<String> country=new TreeSet<>();
        country.add("USA");
        country.add("Japan");
        country.add("South Korea");
        country.add("Germany");
        country.add("London");
        System.out.println(country);
        for (String c:country){
            System.out.println(c);
        }
    }
}
