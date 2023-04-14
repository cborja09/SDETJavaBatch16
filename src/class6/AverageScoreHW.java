package class6;

import java.util.Scanner;

public class AverageScoreHW {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your quiz score.");
        int quizScore= scanner.nextInt();
        System.out.println("Please enter your mid term score.");
        int midtermScore=scanner.nextInt();
        System.out.println("Please enter your final score.");
        int finalScore=scanner.nextInt();

        int averageScore=(quizScore+midtermScore+finalScore)/3;

        if (averageScore>=90) {
            System.out.println("Grade A.");
        } else if (averageScore>=70 && averageScore<90) {
            System.out.println("Grade B.");
        } else if (averageScore>=50 && averageScore<70) {
            System.out.println("Grade C.");
        } else if (averageScore<50) {
            System.out.println("Grade F.");
        }
    }
}
