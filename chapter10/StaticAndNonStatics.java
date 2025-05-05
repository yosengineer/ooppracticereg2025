package chapter10;

public class StaticAndNonStatics {
    private int age;
    private static double height;

    public void sayAge() {
        System.out.println("You are " + age + " years old.");
        System.out.println("You are " + height + " inches.");
    }

    public static void sayHeight() {
        System.out.println("You are " + height + " inches.");
    }
}
