package chapter10;

public class MyMath {
    public static final double PI = 3.14159265358979323846;

    public static double square(double x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.printf("value of PI is: %f\n", MyMath.PI);
        System.out.printf("square of 5 is: %f\n", MyMath.square(5));

        System.out.println(PI);
        System.out.println(square(5));


    }
}
