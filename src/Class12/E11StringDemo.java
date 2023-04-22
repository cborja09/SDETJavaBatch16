package Class12;

public class E11StringDemo {
    public static void main(String[] args) {

        String name="Today is Saturday";
        System.out.println(name.indexOf('i')); // counts the index of the character
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('a',4));// tells java to start search from index 4 which is Y
    }
}
