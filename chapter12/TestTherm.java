package chapter12;

public class TestTherm {
    public static void main(String[] args) {
        ThermUS thermometer = new ThermUS(100);
        System.out.println(thermometer.getTemp());
    }
}
