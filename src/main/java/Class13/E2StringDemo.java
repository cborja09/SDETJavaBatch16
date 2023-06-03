package Class13;

public class E2StringDemo {
    public static void main(String[] args) {

        String str="njkaBBBBAAACCDDDD99999$!";
        System.out.println(str.replaceAll("[a-z]","*")); //replaces all letters with '*'
        System.out.println(str.replaceAll("[A-Z]","#")); // replaces all with '#'
        System.out.println(str.replaceAll("[0-9]","%")); // replaces all with %
        System.out.println(str.replaceAll("[a-z0-9]","%")); // replaces all with %
        System.out.println(str.replaceAll("[a-zA-Z]","%"));
        System.out.println(str.replaceAll("[#-z]","*"));

        char c='A';
        c++;
        System.out.println(c);
        for (int i = 0; i < 10; i++) {
            System.out.println(c++);
        }
    }
}
