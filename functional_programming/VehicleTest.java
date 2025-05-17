package functional_programming;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive();

        Vehicle bike = () -> System.out.println("Bike riding");
        bike.drive();

        Bakery cake = n -> n + "English Cake";
        System.out.println(cake.bake(5));

    }
}
