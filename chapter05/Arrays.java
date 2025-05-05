package chapter05;

public class Arrays {
    public static void main(String[] args) {
        int[] fibs = new int[10];
        fibs[0] = 1;
        fibs[1] = 1;

        for (int i = 0; i < fibs.length; i++) {
            System.out.print(fibs[i] + ", ");
        }

        for (int i = 2; i < fibs.length; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }

        for (int i = 0; i < fibs.length; i++) {
            System.out.print(fibs[i] + ", ");
        }
    }
}
