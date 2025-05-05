package chapter13;

public class Intern extends Student implements Employee {
    private final double income;

    public Intern(String name, String course) {
        super(name, course);
        this.income = STARTING_SALARY;
    }

    @Override
    public double getSalary() {
        return income;
    }

    @Override
    public String description() {
        return String.format("Intern majoring in %s with an income of %.2f", getCourse(), getSalary());
    }
}
