package chapter13;

public class Airplane implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Airplane flying");
    }

    @Override
    public void printModel() {
        System.out.println("Boeng 777");
    }
}
