package Class10;

public class Practice2 {
    public static void main(String[] args) {

        int[][] array2D = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        for(int [] array1D : array2D){
            int sum=0;
            for(int num : array1D){
                sum=sum+num;
            }
            System.out.println(sum);
        }
    }
}
