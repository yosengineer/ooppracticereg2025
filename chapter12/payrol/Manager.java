package chapter12.payrol;

class Manager extends Employee {
    private double salary;

    public Manager(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getPay() {
        return salary;
    }

    public void printData() {
        super.printData();
        System.out.printf("Monthly salary: $%.2f\n", getPay());
    }
}
