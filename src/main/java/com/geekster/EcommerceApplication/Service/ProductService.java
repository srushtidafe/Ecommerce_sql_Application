package com.geekster.EcommerceApplication.Service;

import com.geekster.EcommerceApplication.Model.Product;
import com.geekster.EcommerceApplication.Repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    IProductRepository productRepository;

    public void addAllProduct(Iterable<Product> products) {
        productRepository.saveAll(products);
    }

    public void getAllProduct() {
        productRepository.findAll();
    }

    public void getProductByCategory(String category) {
        productRepository.findByOrderByCategory(category);
    }

    public void deleteProductById(Long productId) {
        productRepository.deleteById(productId);
    }
}
