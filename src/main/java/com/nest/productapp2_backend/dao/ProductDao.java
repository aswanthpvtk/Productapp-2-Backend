package com.nest.productapp2_backend.dao;

import com.nest.productapp2_backend.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
