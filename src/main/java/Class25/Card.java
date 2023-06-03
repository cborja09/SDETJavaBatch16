package Class25;

import java.util.LinkedList;

public class Card {
    /*
    Create a Card class that will have interest rate field and card type
    and a constructor that will initialize the fields.
     */

    private double interestRate;
    private String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate=interestRate;
        this.cardType=cardType;
    }

    public static void main(String[] args) {

        Card card1 = new Card(19.99,"Apple Card");
        Card card2 = new Card(24.99,"Chase Freedom Unlimited");
        Card card3 = new Card(21.49,"Capital One Venture");

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        for (Card card:cards){
            System.out.println("Credit card type "+ card.cardType);
            System.out.println("Credit card interest rate: "+ card.interestRate);
        }
    }
}
