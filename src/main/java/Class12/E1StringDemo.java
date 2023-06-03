package Class12;

public class E1StringDemo {
    public static void main(String[] args) {

        // create the object of that class as step one
        // Syntax: ClassName objectName =new ClassName();
        //String s=new String("Ana");

        String string1="Ana"; // this syntax approach is the most widely used one
        System.out.println(string1.length()); // There are 3 letters in "Ana". Output would be 3.

        String name="Coreyyyyy";

        if (name.length()>8){
            System.out.println("Only 8 characters are allowed.");
        }
    }
}
