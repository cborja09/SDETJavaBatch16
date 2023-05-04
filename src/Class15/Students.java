package Class15;

public class Students {
    /*
    Create a Class called Students.
    Create three  variables  Name, ID, and numberOfStudents.
    Create three objects of the Students Class.
    Set the value for studentName, studentID, and increment the numberOfStudents for each object.
    Print out  total number of students.
     */

    String studentName;
    String studentID;
    static int numberOfStudents;

    public Students(){
        numberOfStudents++;
    }

    public static void main(String[] args) {
        Students student1=new Students();
        student1.studentName="Michaelangelo";
        student1.studentID="TMNT1";

        Students student2=new Students();
        student2.studentName="Raphael";
        student2.studentID="TMNT2";

        Students student3=new Students();
        student3.studentName="Leonardo";
        student3.studentID="TMNT3";

        Students student4=new Students();
        student4.studentName="Donatello";
        student3.studentID="TMNT4";

        System.out.println(Students.numberOfStudents);

    }



}
