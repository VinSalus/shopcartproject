package com.shopcartproject.shopcart.controllers;

import com.shopcartproject.shopcart.entities.User;
import com.shopcartproject.shopcart.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController{

    @Autowired
    private UserService service;

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return service.getUsers();
    }



}