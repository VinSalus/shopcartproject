package com.shopcartproject.shopcart.entities;

import com.shopcartproject.shopcart.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "cart_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Instant moment;
    private int orderStatus;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User client;

    @OneToOne(mappedBy = "order")
    private Payment payment;

//    @ManyToMany
//    @JoinTable(
//            name = "order_products",
//            joinColumns = @JoinColumn(name="order_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name="product_id", referencedColumnName = "id")
//    )
//    private List<Product> items;

    public Order(int id, Instant moment, OrderStatus orderStatus, User client, Payment payment){
        super();
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client;
        this.payment = payment;
        //this.items = items;
    }

    @OneToMany(mappedBy="id.orderId")
    private Set <OrderItem> items = new HashSet<>();

    public double total(double x) {
        return x + 1; //placeholder
    }

    //Get the internal int value of enum class and then convert it to OrderStatus.
    public OrderStatus getOrderStatus(){
        return OrderStatus.valueOf(orderStatus);
    }

    //Stores OrderStatus value as int
    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null) {
            this.orderStatus = orderStatus.getCode();
        }
    }
}