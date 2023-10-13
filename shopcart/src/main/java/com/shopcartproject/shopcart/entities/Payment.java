package com.shopcartproject.shopcart.entities;

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
@Table(name = "cart_payment")
public class Payment implements Serializable {
    private static final long serialVersionUID = 1;
    @Id
    private int id;
    private Date moment;
}