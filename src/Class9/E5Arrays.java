package Class9;

public class E5Arrays {
    public static void main(String[] args) {

        /*
        write a loop that starts from 0 and it goes til the number 5 and print
        only the even numbers.
        {a,b,c,d,e,} => a c e

        create an array of chars and you have to print all the chars on even indexes
         */

        char[] chars={'A','B','C','D','E'};
        for (int i = 0; i < chars.length; i+=2){

            if(i%2==0){
                System.out.println(chars[i]);
            }

        }


    }
}
