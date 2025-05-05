package store;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MyStore {
    private final List<Product> products;

    public MyStore() {
        products = new ArrayList<>();
    }

    private void loadProduct(ProductSource source) throws ProductException {
        products.addAll(source.getProducts());
    }

    private void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        try {
            MyStore store = new MyStore();

            ProductSource source = new FileSource("/Users/yosephabate/products.txt");
            store.loadProduct(source);

            store.displayProducts();
        } catch (ProductException e) {
            System.out.println(e.getMessage());
        }
    }
}
