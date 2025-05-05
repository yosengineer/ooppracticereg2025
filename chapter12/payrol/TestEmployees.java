package chapter12.payrol;

class TestEmployees {
    public static void main(String[] args) {
        Engineer fred   = new Engineer("Fred", "Smith", 12.0, 8.0);
        Manager ann      = new Manager("Ann", "Brown", 1500.0);
        SalesManager mary= new SalesManager("Mary", "Kate", 100.0);

        Employee[] employees = {fred, ann, mary};
        for (Employee e : employees) {
            e.printData();
        }
    }
}
