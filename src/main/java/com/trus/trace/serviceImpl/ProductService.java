package com.trus.trace.serviceImpl;

import com.trus.trace.entity.Product;
import com.trus.trace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    @Cacheable("allProducts")
    public Iterable<Product> getAllProduct(){
        System.out.println("comming");
        return productRepository.findAll();
    }
}
