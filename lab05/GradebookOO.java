package lab05;

import java.util.ArrayList;

public class GradebookOO {
    private final ArrayList<Double> grades;

    public GradebookOO() {
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public void deleteGrade(double grade) {
        grades.remove(grade);
    }

    public void printGrades() {
        for (int i = 0; i < grades.size(); i++) {
            System.out.printf("grades[%d] = %.2f\n", i, grades.get(i));
        }
    }

    public double averageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public String letterGrade() {
        double average = this.averageGrade();
        if (average >= 90.0) {
            return "You got A!";
        } else if (average >= 80.0) {
            return "You got B!";
        } else if (average >= 70.0) {
            return "You got C!";
        } else if (average >= 60.0) {
            return "You got D!";
        } else {
            return "You got F!";
        }
    }
}
