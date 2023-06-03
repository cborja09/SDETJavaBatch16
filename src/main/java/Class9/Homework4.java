package Class9;

public class Homework4 {
    public static void main(String[] args) {

        //Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

        String [] cars={"Subaru", "BMW","Toyota","Honda","Rivian","Tesla"};
        for (int i = 0; i <6; i++) {
            System.out.print(cars[i]+" ");
            
        }
        System.out.println();
        int counter=0;
        while(counter<cars.length){
            System.out.print(cars[counter]+" ");
            counter++;
        }
    }
}
