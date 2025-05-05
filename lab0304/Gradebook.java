package lab0304;

import java.util.Scanner;

public class Gradebook {
    public static double[] readFromTerminal(String[] args) {
        if (args.length == 0) {
            System.out.println("No grades given");
            System.exit(0);
        }

        double[] grades = new double[args.length];

        // collect grades from args into grades
        for (int i = 0; i < args.length; i++) {
            grades[i] = Double.parseDouble(args[i]);
        }

        return grades;
    }

    public static double[] readFromKeyboard() {
        System.out.print("Please enter the number of grades: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        double[] grades = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("grades[%d]: ", i);
            grades[i] = sc.nextDouble();
        }
        return grades;
    }

    public static void printGrades(double[] grades) {
        // print grades
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("grades[%d]: %.2f\n", i, grades[i]);
        }
    }

    public static double averageGrade(double[] grades) {
        // calculate sum
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        // calculate average
        double average = sum / grades.length;
        return average;
    }

    public static String letterGrade(double average) {
        // calculate letter grade
        String message = "You got ";
        if (average >= 90.0) {
            message += "A";
        } else if (average >= 80.0) {
            message += "B";
        } else if (average >= 70.0) {
            message += "C";
        } else if (average >= 60.0) {
            message += "D";
        } else {
            message += "F";
        }
        return message;
    }

    public static void main(String[] args) {
        double[] grades = readFromTerminal(args);
        //double[] grades = readFromKeyboard();

        printGrades(grades);

        double average = averageGrade(grades);
        System.out.printf("Your average grade is %.2f\n", average);

        String message = letterGrade(average);
        System.out.println(message);
    }


}
