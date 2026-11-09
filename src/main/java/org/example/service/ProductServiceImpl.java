package org.example.service;

import org.example.entity.ProductEntity;
import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductRepository productRepository;

    public void createProduct(Product product){
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(product.getName());
        productEntity.setDescription(product.getDescription());
        productEntity.setPrice(product.getPrice());
        productEntity.setActive(product.isActive());

        productRepository.save(productEntity);
    }


    public List<Product> getProduct(){
        return null;
    }
}
