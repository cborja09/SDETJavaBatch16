package Class25;

import java.util.TreeSet;

public class StudentHomework {
    /*
    Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
    Each student object should have name and studentID. Display name of each student.
     */

    private String name;
    private String id;

    public StudentHomework(String name, String id) {
        this.name=name;
        this.id=id;
    }
    public String printInfo() {
        return name+" id";
    }

    public static void main(String[] args) {
        StudentHomework student1 = new StudentHomework("Bart", "A11");
        StudentHomework student2 = new StudentHomework("Milhouse","B12");
        StudentHomework student3 = new StudentHomework("Nelson","C13");

        TreeSet<String> student = new TreeSet<String>();
        student.add(student1.printInfo());
        student.add(student2.printInfo());
        student.add(student3.printInfo());
        System.out.println(student);
    }
}
