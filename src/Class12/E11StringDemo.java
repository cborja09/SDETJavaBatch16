package Class12;

public class E11StringDemo {
    public static void main(String[] args) {

        String name="Today is Saturday";
        //.index counts the index of a specific letter, includes white space in counting as well.
        System.out.println(name.indexOf('i')); // 'i' would be index 6
        System.out.println(name.indexOf('a')); // 'a' would be index 3
        System.out.println(name.indexOf('a',4));// tells java to start search from index 4 which is Y
    }
}
