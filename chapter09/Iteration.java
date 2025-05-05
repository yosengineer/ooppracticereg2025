package chapter09;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {
    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(1.0);
        grades.add(2.0);
        grades.add(3.0);

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        System.out.println(sum);
    }
}
