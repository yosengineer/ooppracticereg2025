package chapter06;

public class MultipleMethods {
    // overloaded methods
    public static double add(int a, int b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(1.2, 2));
    }
}
