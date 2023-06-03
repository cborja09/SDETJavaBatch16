package Class14;

public class E6 {

    // create a method which returns true or false and takes an int
    // number as a parameter if number is even, it returns true otherwise it returns false.
    // name of the method should be isEven.

    boolean isEven(int number){
        boolean isEven=false;
        if (number%2==0){
            isEven=true;
        }
        return isEven;
    }

    public static void main(String[] args) {
        E6 obj=new E6();
        System.out.println(obj.isEven(15));
    }
}
