package Class17;

import Class11.Student;

public class StudentTester {

    public static void main(String[] args) {
        Students student1=new Students("Corey",99,92,95);
        Students student2=new Students("Heidi",98,99,97);
        Students student3=new Students("Gautam", 99,97,95);
        Students student4=new Students("Vineet",95,96,93);
        Students student5=new Students("Brian",93,91,90);

        student1.calculateAverageGrade();
        student2.calculateAverageGrade();
        student3.calculateAverageGrade();
        student4.calculateAverageGrade();
        student5.calculateAverageGrade();


    }
}
