package Class10;

public class Practice {
    public static void main(String[] args) {

        // Write a program that will print the sum of all elements in 2D array.

        int[][] a = {
                { -5,-2,-3,7 },
                { 1,-5,-2,2 },
                { 1,-2,3,-4 }
        };

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);

    }
}
