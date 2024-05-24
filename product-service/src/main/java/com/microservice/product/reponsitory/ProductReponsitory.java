package com.microservice.product.reponsitory;

import com.microservice.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductReponsitory extends MongoRepository<Product, String>{
}
