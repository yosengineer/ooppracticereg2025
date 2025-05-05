package lab01;

public class TempConverter {
    public static void main(String[] args) {
        double celsius = 100;
        double fahrenheit = 1.8 * celsius + 32;

        System.out.printf("Celcius = %.2f, Fahrenheit = %.2f\n",
                celsius, fahrenheit);
    }
}
