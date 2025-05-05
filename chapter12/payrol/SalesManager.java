package chapter12.payrol;

class SalesManager extends Manager {
    private double salesBonus;

    public SalesManager(String firstName, String lastName, double salesBonus) {
        super(firstName, lastName, 1250.0);
        this.salesBonus = salesBonus;
    }

    public double getPay() {
        return super.getPay() + salesBonus;
    }

    public void printData() {
        super.printData();
    }
}
