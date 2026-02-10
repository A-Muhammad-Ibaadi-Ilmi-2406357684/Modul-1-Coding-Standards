package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product){
        if (product.getProductId() == null) {
            // Create new product; randomly generate UUID
            product.setProductId(UUID.randomUUID().toString());
            productData.add(product);
        } else {
            // Update existing product
            String newProductId = product.getProductId();
            for (int i = 0; i < productData.size(); i++) {
                Product existingProduct = productData.get(i);
                String existingProductId = existingProduct.getProductId();
                if (existingProductId.equals(newProductId)) {
                    productData.set(i, product);
                }
            }
            // TODO: Handle product ID not found case
        }
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }
}
