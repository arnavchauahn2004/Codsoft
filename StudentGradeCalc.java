import java.util.Scanner;
public class StudentGradeCalc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks in 5 subjects (out of 100):");
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
        }

        int totalmarks = 0;
        for (int mark : marks) {
            totalmarks += mark;
        }

        double avgPercentage = (totalmarks / 500.0) * 100;

        String grade;
        if (avgPercentage>= 90) {
            grade = "A";
        } else if (avgPercentage>= 80) {
            grade = "B";
        } else if (avgPercentage>= 70) {
            grade = "C";
        } else if(avgPercentage>=60){
            grade = "D";
        }
        else{
            grade="F";
        }

        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);
    }
}