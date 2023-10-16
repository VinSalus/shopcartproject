package com.shopcartproject.shopcart.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "cart_pcategory")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String name;
    @ManyToMany(mappedBy = "categories")
    private List<Product> products;
}