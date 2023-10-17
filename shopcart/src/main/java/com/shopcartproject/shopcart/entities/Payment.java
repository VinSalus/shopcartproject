package com.shopcartproject.shopcart.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "cart_payment")
public class Payment implements Serializable {
    private static final long serialVersionUID = 1;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date paymentMoment;

    @OneToOne(optional = false)
    @JoinColumn(name="order_id", referencedColumnName = "id")
    private Order order;
}