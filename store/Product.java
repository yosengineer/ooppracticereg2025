package store;

public class Product {
    private final String name;
    private final double price;

    // constructor
    public Product(String name, double price) throws ProductException {
        if (name == null) throw new ProductException("Product name cannot be null!");
        if (price < 0) throw new ProductException("Product price cannot be negative!");

        this.name = name;
        this.price = price;
    }

    // accessors/getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
