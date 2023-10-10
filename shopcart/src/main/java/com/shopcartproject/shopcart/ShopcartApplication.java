package com.shopcartproject.shopcart;

import com.shopcartproject.shopcart.enums.OrderStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopcartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopcartApplication.class, args);
		OrderStatus changu = OrderStatus.WAITING_PAYMENT;
		System.out.println(changu);
	}
}