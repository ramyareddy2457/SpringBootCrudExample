package com.java.springbootcrudexample.repository;

import com.java.springbootcrudexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
    String deleteById(int id);

    List<Product> findByIdAndName(int id, String name);

    List<Product> findByQuantity(int quantity);
}
