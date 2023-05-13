package Class19;
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

public class StaticMethod {


    static void Method(String word, int num){
        System.out.println("The first part of " + " " +word+ " " +num);
    }

    static void Method(int num){
        System.out.println("The second part of " + " " +num);
    }
    static void Method(String word){
        System.out.println("The third part of " + " " +word);
    }

    public static void main(String[] args) {
        StaticMethod stat = new StaticMethod();
        stat.Method("December", 25);
        stat.Method(25);
        stat.Method("December");
    }
}
