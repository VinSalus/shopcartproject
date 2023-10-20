package com.shopcartproject.shopcart.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderItem {

    @EmbeddedId
    private OrderItemId id;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    //Quantity and Price are known by the Order and Product.
    //They will be mapped to an extra association table connecting both objects via their primary key.
    private int quantity;
    private double price;

    public OrderItem(Order order, Product product, int quantity, double price) {
        super();
        id.setOrderId(order);
        id.setProductId(product);
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Order getOrder(){
        return id.getOrderId();
    }

    public void setOrder(Order order){
        id.setOrderId(order);
    }

    public Product getProduct(){
        return id.getProductId();
    }

    public void setProduct(Product product){
        id.setProductId(product);
    }



    //    public double subTotal (int quantity, double price, double total){
//        this.total = total;
//        total.setTotal(quantity * price);/
//        return total;
//    }
}