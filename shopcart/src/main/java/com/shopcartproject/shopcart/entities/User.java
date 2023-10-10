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
@Table(name = "cart_user")
public class User implements Serializable {

@Id
private long id;
private String name;
private String email;
private String phone;
private String password;
}