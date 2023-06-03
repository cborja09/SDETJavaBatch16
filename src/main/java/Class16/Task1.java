package Class16;

import java.sql.SQLOutput;

public class Task1 {
    /*
    Create a method that will accept an array as parameters as will return a sum of all elements from that array.
    Method should be visible only with same package and accessible by the created an instance/object of the class.
     */


    int sumArray(int [] arr){
        int sum=0;
        for (int number:arr){
            sum=sum+number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        int result=task1.sumArray(new int[]{10,10,10});
        System.out.println(result);
    }


}
