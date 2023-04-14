package class7;

public class E11WhileLoopTask {

    public static void main(String[] args) {

        /*
        print numbers from 100 to 1
        print even numbers from 20 to 100
        print only odd numbers from 100 to 1
         */

        int counter=100;
        while(counter>0){ //counter>=1
            System.out.print(counter+" ");
            counter--;
        }
        // assigning a new value to the counter loop
        int counter1=20;
        System.out.println();
        while(counter1<=100){
            System.out.print(counter1+" ");
            counter1+=2;
        }

        int counter2=100;
        System.out.println(); //so that we can see the next output on a new line
        while(counter2>=1){
            // odd numbers when divided by 2 gives 1 as a remainder
            if(counter2%2!=0){ //it's as counter%2!=0
                System.out.print(counter2+" ");
            }
            counter2--;
        }
    }
}
