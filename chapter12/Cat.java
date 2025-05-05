package chapter12;

public class Cat extends Animal {
    private int hairBalls;

    public Cat(String name, int hairBalls) {
        super(name);
        this.hairBalls = hairBalls;
    }

    public int getHairBalls() {
        return hairBalls;
    }

    public void speak() {
        System.out.println("Meow!");
    }
}
