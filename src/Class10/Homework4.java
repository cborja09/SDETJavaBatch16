package Class10;

public class Homework4 {
    public static void main(String[] args) {
        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int[][] arr = {
                {9, 9, 1},
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int columns = 0; columns < arr[row].length; columns++) {
                System.out.print(arr[row][columns]+ " ");
            }
            System.out.println();
        }
    }
}
