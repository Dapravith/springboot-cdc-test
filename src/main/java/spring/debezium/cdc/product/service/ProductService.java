
package spring.debezium.cdc.product.service;

import spring.debezium.cdc.product.entity.Product;

public interface ProductService {
    void handleEvent(String operation, String documentId, String collection, Product product);
}
