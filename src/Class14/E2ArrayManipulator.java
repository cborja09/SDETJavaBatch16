package Class14;

public class E2ArrayManipulator {

    /*
    create a method that will take an integer array and call it sumArr and return the sum of all the elements from
    that array. create the object of the class and call the method.
     */

    /*
    return type: int
    name of the method: sumArr
    parameters=> (int [] arr)
    body=>
    {
    go through all the elements of the array, add them and return the reults
    }
     */

    int sumArr(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        E2ArrayManipulator obj= new E2ArrayManipulator();
        int [] array={10,20,30};
        int result=obj.sumArr(array);
        obj.sumArr(array);
        System.out.println(result);
    }
}
