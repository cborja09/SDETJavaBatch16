package Class3;

public class E13TypeCastiing {
    public static void main(String[] args) {
        //byte=>short=>short=>int=>long=>float=>double (smallest to big data types)


        byte num=127;
        short num2=num;
        // no issues as we are putting something from a smaller box to a larger box
        System.out.println(num2);

        int num3=1111120;
        double num4=num3;
        System.out.println(num4);


    }
}
