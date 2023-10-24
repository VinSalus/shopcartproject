package com.shopcartproject.shopcart.services;

import com.shopcartproject.shopcart.entities.User;
import com.shopcartproject.shopcart.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository repository;

    //POST
    public User saveUser(User user){
        return repository.save(user);
    }

    //GET
    public List<User> getUsers(){
        return repository.findAll();
    }
}