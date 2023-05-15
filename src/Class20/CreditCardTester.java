package Class20;

public class CreditCardTester {

    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard();
        creditCard.calculateInterest();

        AX ax=new AX();
        ax.calculateInterest(10900,1.9);

        Visa visa=new Visa();
        visa.calculateInterest(10900,1.9);

    }
}
