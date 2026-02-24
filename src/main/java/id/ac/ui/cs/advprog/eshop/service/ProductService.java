package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> findAll();
    Product findById(String productId);
    boolean deleteById(String productId);
}
