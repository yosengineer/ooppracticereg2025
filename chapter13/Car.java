package chapter13;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car driving");
    }

    @Override
    public void printModel() {
        System.out.println("Vitz model");
    }
}
