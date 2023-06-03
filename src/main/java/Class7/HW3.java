package Class7;

public class HW3 {
    public static void main(String[] args) {

        // print odd numbers between 20 and 50 (two ways)

        int counter=20;
        while (counter<=50){
            if (counter%2==1){
                System.out.print(counter+" ");
            }
            counter++;
        }
        System.out.println();

        for (int number=20;number<=50;number++){
            if (number%2==1){
                System.out.print(number+" ");
            }
        }




    }
}
