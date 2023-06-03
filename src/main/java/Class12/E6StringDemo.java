package Class12;

public class E6StringDemo {
    public static void main(String[] args) {

        String name="Justin";

        System.out.println(name.equals("Axel"));
        System.out.println(name.equals("Justin"));
        System.out.println(name.equals("JUSTIN"));
        System.out.println(name.equalsIgnoreCase("JUSTIN")); // IgnoreCase is all casing even if all caps
        System.out.println(!name.equalsIgnoreCase("JUSTIN"));
    }
}
