package Class15;

public class SyntaxEmployee {

    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee asghar=new SyntaxEmployee();
        asghar.empId ="126456";
        asghar.salary=90000;
        System.out.println(asghar.CEO); // not the preffered way
        System.out.println(SyntaxEmployee.CEO); // this is the preffered way

        SyntaxEmployee soheil=new SyntaxEmployee();
        soheil.empId="584685";
        soheil.salary=92000;
        System.out.println(soheil.empId);
        System.out.println(asghar.empId);
    }

}
