package Class20;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.

    double interest;
    double balance;

    void calculateInterest(){
        System.out.println(balance * interest);
    }
    void calculateInterest(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
        System.out.println(balance * interest);
    }


}
