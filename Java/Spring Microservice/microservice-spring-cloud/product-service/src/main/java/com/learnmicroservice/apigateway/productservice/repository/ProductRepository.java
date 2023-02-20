package com.learnmicroservice.apigateway.productservice.repository;

import com.learnmicroservice.apigateway.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
