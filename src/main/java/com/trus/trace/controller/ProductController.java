package com.trus.trace.controller;

import com.trus.trace.entity.Product;
import com.trus.trace.repository.ProductRepository;
import com.trus.trace.serviceImpl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/v1")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;


    @GetMapping("/products")
    public List<Product> getProductList(){

       return StreamSupport.stream(productService.getAllProduct().spliterator(),false).collect(Collectors.toList());


    }
    @GetMapping("/p")
    public void save(){
        Product product=new Product();
        product.setProductid("2");
        product.setPrice(123);
        product.setProductName("EEEE");
        product.setProductCategory("Demo");
        productRepository.save(product);
    }
}
