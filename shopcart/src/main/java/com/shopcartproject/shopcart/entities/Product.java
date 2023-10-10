package com.shopcartproject.shopcart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "cart_product")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;
}