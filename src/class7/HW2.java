package class7;

public class HW2 {
    public static void main(String[] args) {

        // print even numbers from 20 to 1 (two ways: while loop and for loop)

        int counter=20;
        while (counter>=1){
            System.out.print(counter+" ");
            counter-=2;
        }
        System.out.println();

        for (int i=20;i>=1;i-=2){
            System.out.print(i+" ");
        }


    }
}
