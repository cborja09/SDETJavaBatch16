package Class13;

public class E3StringDemo {
    public static void main(String[] args) {

        String str="ksnfksnDKDDKKDDDKK123456978$@#%&*!";

        System.out.println(str.replaceAll("[^a-z]", ""));
        //don't replace lowercase letters from a-z and numbers from 0-9
        System.out.println(str.replaceAll("[^a-z0-9A-Z]", ""));
        System.out.println(str.replaceAll("[Dn3]","*"));
        System.out.println(str.replaceAll("[A-Z]","\\$"));

    }
}
