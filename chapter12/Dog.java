package chapter12;

public class Dog extends Animal {
    private int fleas;

    public Dog(String name, int fleas) {
        super(name);
        this.fleas = fleas;
    }

    public int getFleas() {
        return fleas;
    }

    public void speak() {
        System.out.println("Woof!");
    }
}
