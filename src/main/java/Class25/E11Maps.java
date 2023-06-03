package Class25;

import java.util.Collection;
import java.util.TreeMap;

public class E11Maps {
    public static void main(String[] args) {

        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipstick",100.0);
        makeup.put("Blush",68.0);
        makeup.put("Eye Liner",80.0);
        makeup.put("Foundation",120.0);
        makeup.put("Base",25.0);

        Collection<Double> values = makeup.values();
        values.removeIf(v->v>80);
        System.out.println(makeup);


    }
}
