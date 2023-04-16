package Class10;

public class Homework1 {
    public static void main(String[] args) {

        //Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        //Then your program should print name of the students that has A and B grad.

        String[][]names={
                {"Corey","Gautam","Brian","Gian"},
                {"A","B","C","D"}

        };
        System.out.print(names[0][0]+ " " +names[1][0]);
        System.out.println();
        System.out.print(names[0][1]+ " " +names[1][1]);
    }
}
