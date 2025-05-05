package chapter12;

public class ThermUS extends Therm {
    public ThermUS(double celsius) {
        super(celsius);
    }

    public double getTemp() {
        return super.getTemp() * 1.8 + 32;
    }
}
