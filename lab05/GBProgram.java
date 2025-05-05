package lab05;

import java.util.Scanner;

public class GBProgram {
    private static void repeatedTasks(GradebookOO gb) {
        gb.printGrades();
        double average = gb.averageGrade();
        System.out.printf("Your average grade is %.2f\n", average);
        System.out.println(gb.letterGrade());
    }

    public static void main(String[] args) {
        GradebookOO gb = new GradebookOO();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade: ");
            double grade = sc.nextDouble();
            gb.addGrade(grade);
        }

        repeatedTasks(gb);

        System.out.print("Enter grade to be deleted: ");
        double grade = sc.nextDouble();
        gb.deleteGrade(grade);

        repeatedTasks(gb);
    }


}
