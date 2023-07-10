package com.geekster.EcommerceApplication.Controller;

import com.geekster.EcommerceApplication.Model.Product;
import com.geekster.EcommerceApplication.Model.User;
import com.geekster.EcommerceApplication.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping(value = "Product")
    public String addAllProduct(@RequestBody Iterable<Product> products){
        productService.addAllProduct(products);
        return"Added";
    }
    @GetMapping(value = "Product")
    public void getAllProduct(){
        productService.getAllProduct();
    }

    @GetMapping(value = "Product/Category/{category}")
    public void getProductByCategory(@PathVariable String category){
        productService.getProductByCategory(category);
    }

    @DeleteMapping("Product/Id/{productId}")
    public String deleteProductById(@PathVariable Long productId){
        productService.deleteProductById(productId);
        return "Deleted";
    }
}
