package Class12;

public class E4StringDemo {
    public static void main(String[] args) {

        String firstName="Ana";
        String lastName="Tasevska";

        String fullName=firstName+lastName; // this syntax is the most widely used approach
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));
    }
}
