package com.shopcartproject.shopcart.entities;

import com.shopcartproject.shopcart.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User client;

    @OneToOne(mappedBy = "order")
    private Payment payment;

    @ManyToMany
    @JoinTable(
            name = "order_products",
            joinColumns = @JoinColumn(name="order_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="product_id", referencedColumnName = "id")
    )
    private List<Product> items;
}