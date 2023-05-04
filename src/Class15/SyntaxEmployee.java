package Class15;

public class SyntaxEmployee {

    /*
    Create a Class called SyntaxEmployee:
    Create three variables empID, salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee.
    Set the value of eID, salary for each of the objects.
    Print out the eID , salary, and CEO for each of the objects.
     */

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
