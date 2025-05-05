package chapter07;

public class TestLightSwitch {
    public static void main(String[] args) {
        LightSwitch ls = new LightSwitch();

        if (ls.isOn()) {
            System.out.println("Light is on!");
        } else {
            System.out.println("Light is off!");
        }

        String name = "Abebe";
        char ch = name.charAt(2);
        System.out.println(ch);
    }
}
