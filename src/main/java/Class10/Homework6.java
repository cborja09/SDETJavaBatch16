package Class10;

public class Homework6 {
    public static void main(String[] args) {
        //Create 2D array of countries: North America countries, South America countries, Europe countries, Asian countries, African countries.
        //Then print all values from that array using 2 different loops and calculate how many total countries been stored.

        String [][] arr={
                {"USA","Mexico", "Canada"},
                {"Brazil","Peru"},
                {"England","France","Germany","Spain","Belgium"},
                {"Japan","South Korea","Thailand"},
                {"South Africa","Nigeria","Ghana"}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int columns = 0; columns<arr[row].length; columns++) {
                System.out.println(arr[row][columns]+" ");
            }
            System.out.println();

        }
        System.out.println();
        //
        for(String [] countries : arr ){
            for(String country: countries){
                System.out.println(country+" ");
            }
            System.out.println();
        }
    }
}
