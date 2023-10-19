package com.shopcartproject.shopcart.test;

import com.shopcartproject.shopcart.entities.Order;
import com.shopcartproject.shopcart.entities.User;
import com.shopcartproject.shopcart.enums.OrderStatus;
import com.shopcartproject.shopcart.repositories.OrderRepository;
import com.shopcartproject.shopcart.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.Arrays;

//Test File to test if data is getting properly sent to database.
@Configuration
@RequiredArgsConstructor
public class TestConfig implements CommandLineRunner {
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(1, "Jambo", "cristopher@gmail.com", "1194895401", "cumulus");
        Order o1 = new Order(1, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u1, null);
        userRepository.saveAll(Arrays.asList(u1));
        orderRepository.saveAll(Arrays.asList(o1));
    }
}