package com.shopcartproject.shopcart.entities;

//Extra association table to map a composite primary key consisting of Book and Publisher entities.
//The association is mapped with an embeddable that represents the primary key and 2 @MapsId annotation
// in OrderItem class.

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class OrderItemId implements Serializable {
    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order orderId;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product productId;
}