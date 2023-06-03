package Class7;



public class Practice {
    public static void main(String[] args) {

        //print numbers 1 to 50 using a while loop

        int number=1;
        while (number<=50){
            System.out.print(number+" ");
            number++;
        }

        System.out.println();

        //print numbers 50 to 1 using a while loop

        int counter=50;
        while (counter>=1){
            System.out.print(counter+" ");
            counter--;
        }

        System.out.println();

        //print these numbers 2 4 6 8 10 12 14 using a while loop

        int evenNumbers=2;
        while (evenNumbers<=14){
            System.out.print(evenNumbers+" ");
            evenNumbers+=2;
        }

        System.out.println();

        // print  odd numbers between 10 and 90 using a while loop

        int oddNumbers=10;
        while (oddNumbers<=90){
            if (oddNumbers%2==1){
                System.out.print(oddNumbers+" ");
            }
            oddNumbers++;
        }

        System.out.println();

        // print these even numbers between 30 and 80 using a while loop

        int even=30;
        while (even<=80){
            if (even%2==0){
                System.out.print(even+" ");
            }
            even++;
        }

        System.out.println();

        // print all numbers from 1 to 50 using a for loop on same line

        for (int i=1; i<=50;i++){
            System.out.print(i);
        }

        System.out.println();

        //print all numbers from 50 to 1 using a for loop on same line

        for (int j=50;j>=1;j--){
            System.out.print(j);
        }

        System.out.println();

        // print numbers 1 to 20 using a do while loop

        int numberOne=1;
        do {
            System.out.print(numberOne+" ");
            numberOne++;
        }while (numberOne<20);

        System.out.println();

        // print numbers 20 to 1 using a do while loop

        int twenty=20;
        do {
            System.out.print(twenty+" ");
            twenty--;
        }while (twenty>=1);







    }
}
