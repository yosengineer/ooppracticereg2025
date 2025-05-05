package store;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class KeyboardSource implements ProductSource {
    public KeyboardSource() {}

    @Override
    public List<Product> getProducts() throws ProductException {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        try {
            System.out.print("Enter product name:  ");
            String name = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            Product product = new Product(name, price);
            products.add(product);
        } catch (InputMismatchException e) {
            throw new ProductException("Product price must be a number!");
        }

        return products;
    }
}
