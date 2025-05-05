package chapter13;

public interface Vehicle {
    void drive();

    default void printModel() {
        System.out.println("Vehicle Model");
    }

    static void price() {
        System.out.println("Price of vehicle");
    }
}
