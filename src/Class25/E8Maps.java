package Class25;

import java.util.LinkedHashMap;

public class E8Maps {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> ranks=new LinkedHashMap<>();
        ranks.put(1,"James");
        ranks.put(2,"Adam");
        ranks.put(3,"John");
        ranks.put(4,"Jimmy");
        System.out.println(ranks);
        ranks.remove(2); //removes Adam
        System.out.println(ranks);
        ranks.replace(1,"Adam"); //replaces James for Adam in key 1
        System.out.println(ranks);

    }
}
