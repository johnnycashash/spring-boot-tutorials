package org.johnnycash.springmvc.services;

import org.johnnycash.springmvc.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllProducts();
    Product getProductById(Integer id);
    Product saveOrUpdateProduct(Product product);

    void deleteProzductById(Integer id);
}
