package Class10;

public class Homework2 {
    public static void main(String[] args) {
        //Create 2D array of cars : american, german, korean, italian.
        //Then retrieve all values from that array using 2 different loops.

        String[][]cars= {{"American", "German" },
                {"Korean", "Italian" }
        };
        // For Loop
        for(int row=0; row< cars.length; row++){
            for(int column=0; column< cars[row].length; column++){
                System.out.print(cars[row][column]+" ");
            }
            System.out.println();
        }
        System.out.println();
        // Enhanced For Loop
        for (String[] car : cars) {
            for(String type: car  )
                System.out.print(type+" ");
        }
        System.out.println();
    }
}
