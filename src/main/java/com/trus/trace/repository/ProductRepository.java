package com.trus.trace.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.trus.trace.entity.Product;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CosmosRepository<Product,String> {

    @Cacheable(value = "product",key = "product.productid")
    Optional<Product> findById(String s);

    List<Product> findAll();
}
