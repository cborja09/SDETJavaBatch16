package Class9;

public class Homework7 {
    public static void main(String[] args) {

        // From an array of integer elements find the largest number.

        int [] numbers={20,40,60,300};
        int largest=numbers[0];

        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i]>largest){
                largest=numbers[i];
            }

            
        }
        System.out.println("The largest number is "+ largest);



    }
}
