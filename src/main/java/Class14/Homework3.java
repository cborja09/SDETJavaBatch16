package Class14;

public class Homework3 {
    // Write a method to return whether given number is prime or not?

    boolean checkPrime(int number){
        if (number<=1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Homework3 obj=new Homework3();
        int number=11;
        System.out.println(obj.checkPrime(number));
    }
}
