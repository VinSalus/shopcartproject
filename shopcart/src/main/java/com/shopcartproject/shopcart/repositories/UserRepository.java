package com.shopcartproject.shopcart.repositories;

import com.shopcartproject.shopcart.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}