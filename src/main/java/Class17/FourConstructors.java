package Class17;

/*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
     and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different
     class inside different package and observe result.
     */
public class FourConstructors {

    String word;
    int x;
    char character;

    private FourConstructors(){
        System.out.println("The private constructor is called.");
    }
    public FourConstructors(String word){
        System.out.println(word+" constructor is called.");
    }
    FourConstructors(int x){
        System.out.println("The defualt contructor is called.");
    }
    private FourConstructors(char character){
        System.out.println("The private constructor is called"+character);
    }

    public static void main(String[] args) {
        FourConstructors constructor1=new FourConstructors();
    }
}
