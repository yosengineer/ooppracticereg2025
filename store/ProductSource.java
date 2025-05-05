package store;

import java.util.List;

public interface ProductSource {
    List<Product> getProducts() throws ProductException;
}
