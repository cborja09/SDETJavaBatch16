package Class17;

public class FourConstructorsTester {
    public static void main(String[] args) {
        /*
        For the constructor1, it cannot be called due to it being set as private.
         */
        FourConstructors contructor2=new FourConstructors("Public");
        FourConstructors constructor3=new FourConstructors(1);
        FourConstructors constructor4=new FourConstructors('.');

    }
}
