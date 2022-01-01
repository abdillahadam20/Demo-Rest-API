package com.domain.demoapi.models.repository;

import java.util.List;

import com.domain.demoapi.models.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
  List<Product> findByNameContains(String name);
}
