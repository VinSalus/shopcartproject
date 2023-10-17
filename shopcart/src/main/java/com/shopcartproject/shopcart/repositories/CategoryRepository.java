package com.shopcartproject.shopcart.repositories;

import com.shopcartproject.shopcart.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}