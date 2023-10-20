package com.shopcartproject.shopcart.entities;

//Extra association table to map a composite primary key consisting of Book and Publisher entities.
//The association is mapped with an embeddable that represents the primary key and 2 @MapsId annotation
// in OrderItem class.

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class OrderItemId implements Serializable {
    private static final long serialVersionUID = 1L;
    private Order orderId;
    private Product productId;
}