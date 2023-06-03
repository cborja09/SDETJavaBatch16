package Class18;

public class E1MultipleConstructor {

    public static void main(String[] args) {
        String str=new String("Java");
        char [] chars={'J','a','v','a'};
        String str1=new String(chars);
        // extra the word java and convert it to upper case
        char [] chars2={'t','h','e','J','a','v','a'};
        String str3=new String(chars2,3,4);// offset means skip first 3 characters in this example.
        System.out.println(str3.toUpperCase());
    }
}
