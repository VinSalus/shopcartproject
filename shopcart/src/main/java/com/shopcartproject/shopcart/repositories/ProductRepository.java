package com.shopcartproject.shopcart.repositories;

import com.shopcartproject.shopcart.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}