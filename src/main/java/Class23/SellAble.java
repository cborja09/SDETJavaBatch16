package Class23;

public interface SellAble {

     //private int PRICE=12000; // all fields are public, static, or final. private access modifiers not allowed.
    //protected int PRICE=12000; // protected access modifiers are not allowed as well.

    int PRICE=12000;

    //final void sell(); final not allowed as methods are abstract by default
    // static void sell(); not allowed as static methods can't be overridden

    //private void sell(); not allowed as no one will be able to provide implementation
    //protected void sell(); not allowed

    static void sell(){
        System.out.println("Allowed");
    }
}
class Tester1{
    public static void main(String[] args) {
        SellAble.sell();
    }
}
