package chapter12.payrol;

class Engineer extends Employee {
    private double hoursWorked, wage;

    public Engineer(String firstName, String lastName, double hoursWorked, double wage) {
        super(firstName, lastName);
        this.hoursWorked = hoursWorked;
        this.wage = wage;
    }

    public double getPay() {
        return hoursWorked * wage;
    }

    public void printData() {
        super.printData();
        System.out.printf("Weekly pay: $%.2f\n", getPay());
    }
}
