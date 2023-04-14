package Class8;

public class E3ForLoop {
    public static void main(String[] args) {

        // write a loop to add all the even numbers from 1 to 30
        int sum=0; // creating a variable to hold the sum
        for (int i=1; i<=30; i++){
            if (i%2==0){ // checking if the number is even
                sum=sum+i; // sum+=i; this is the same way as well// adding all the even numbers to the sum variable
                            // one by one
            }
        }

        System.out.println(sum);


    }
}
