package chapter06;

public class Greetings {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.printf("Hello, %s!\n", args[i]);
        }
    }
}
