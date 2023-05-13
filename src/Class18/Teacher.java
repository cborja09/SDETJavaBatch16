package Class18;

import java.sql.SQLOutput;

public class Teacher {
    /*
    Write a Java program called Teacher. Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher,ChemistryTeacher and PianoTeacher.Test all 4 classes.
     */

    String name;
    int age;
    int yearsWorked;

    void speaks(){
        System.out.println("The teacher is speaking to the class.");
    }
    void listening(){
        System.out.println("The teacher is listening to the students.");
    }
    void grading(){
        System.out.println("The teacher is grading the homework assignments.");
    }
    void teaching(){
        System.out.println("The teacher " +name+" is teaching the class.");
    }


}
