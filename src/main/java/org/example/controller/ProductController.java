package org.example.controller;

import org.example.model.Product;
import org.example.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @PostMapping("/product/create")
    void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    @GetMapping("/product/all")
    List<Product> getProduct(){
        return productService.getProduct();
    }

}
