package Class17;

public class Students {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student's name.
     */

    String name;
    int gradeOne;
    int gradeTwo;
    int gradeThree;

    Students(String studentName, int subjectGradeOne, int subjectGradeTwo, int subjectGradeThree){
        name=studentName;
        gradeOne=subjectGradeOne;
        gradeTwo=subjectGradeTwo;
        gradeThree=subjectGradeThree;
    }
    void calculateAverageGrade(){
        System.out.println((gradeOne+gradeTwo+gradeThree)/3);
    }
}
