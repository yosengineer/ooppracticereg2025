package chapter12.payrol;

class Employee {
    private String firstName, lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printData() {
        System.out.printf("%s %s\n", firstName, lastName);
    }

}
