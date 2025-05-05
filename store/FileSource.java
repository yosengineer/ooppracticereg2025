package store;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileSource implements ProductSource {
    private final String fileName;

    public FileSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Product> getProducts() throws ProductException {
        List<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                StringTokenizer st = new StringTokenizer(line, "$");
                String name = st.nextToken();
                double price = Double.parseDouble(st.nextToken());

                Product product = new Product(name, price);
                products.add(product);

                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new ProductException("File not found!");
        } catch (IOException e) {
            throw new ProductException(e.getMessage());
        }

        return products;
    }
}
