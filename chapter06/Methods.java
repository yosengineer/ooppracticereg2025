package chapter06;

public class Methods {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int factorial2(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void printLine() {
        System.out.println();
    }

    public static int abs(int n) {
        if (n >= 0)
            return n;
        else
            return -n;
    }

    public static void main(String[] args) {
        int a = 5;
        printLine();
        System.out.println("The End!");
    }
}
