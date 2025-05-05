package chapter07;

public class LightSwitch {
    // define states of LightSwitch objects
    private int on = 1;

    // define behaviors of LightSwitch objects
    public boolean isOn() {
        return on == 1;
    }

    public void switchLight() {
        on = 1 - on;
    }
}
