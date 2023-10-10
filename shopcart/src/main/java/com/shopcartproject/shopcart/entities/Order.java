package com.shopcartproject.shopcart.entities;

import com.shopcartproject.shopcart.enums.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "cart_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private Date moment;
    private OrderStatus orderStatus;
    public double total(double x) {
    return x + 1; //placeholder
    }
}