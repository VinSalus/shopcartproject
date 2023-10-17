package com.shopcartproject.shopcart.repositories;

import com.shopcartproject.shopcart.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}