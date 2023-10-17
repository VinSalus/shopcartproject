package com.shopcartproject.shopcart.repositories;

import com.shopcartproject.shopcart.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}