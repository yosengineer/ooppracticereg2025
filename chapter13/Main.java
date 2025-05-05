package chapter13;

class Main {
    public static void main(String[] args) {
//        Intern a = new Intern("Conor", "Math");
//        Student b = new Intern("Conor", "Math");
//        Employee c = new Intern("Conor", "Math");
//
//        System.out.println(((Intern)b).getSalary());
//        System.out.println(((Employee)b).getSalary());
//        System.out.println(((Intern)c).getCourse());
//        System.out.println(((Student)c).getCourse());

        Vehicle[] vehicles = {
                new Car(),
                new Airplane(),
        };
        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
            vehicle.printModel();
            Vehicle.price();
        }
    }
}
