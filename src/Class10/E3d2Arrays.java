package Class10;

public class E3d2Arrays {

    public static void main(String[] args) {

        int [][] matrix={
                {10,20,30},
                {20,50,65},
                {102,54,60},
        };

        System.out.println();
        int [] arr1=matrix[0];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
