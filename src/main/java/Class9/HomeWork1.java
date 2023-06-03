package Class9;

public class HomeWork1 {
    public static void main(String[] args) {

        //Create an array of chars and store grades into it: A,B,C,D.
        //Then print a grade B (use 2 different ways of creating an array).

        char [] grades={'A','B','C','D'};
        System.out.println(grades[1]);

        char []number= new char[4];
        number[0]='A';
        number[1]='B';
        number[2]='C';
        number[3]='D';
        System.out.println(number[1]);



    }
}
