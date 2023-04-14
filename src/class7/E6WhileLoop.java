package class7;

public class E6WhileLoop {
    public static void main(String[] args) {

        //print these numbers 2 4 6 8 10 12 14 using a while loop

        int counter=2;
        while(counter<=14){
            System.out.println(counter);
            // below line will increase the value of the counter by 2 everytime
            counter+=2; // can also be counter=counter+2, counter ++ counter++
        }
    }
}
