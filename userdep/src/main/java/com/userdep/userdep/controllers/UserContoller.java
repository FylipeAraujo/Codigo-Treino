package com.userdep.userdep.controllers;

import com.userdep.userdep.entiites.User;
import com.userdep.userdep.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserContoller {

    @Autowired
    private UserRespository reposotory;

    @GetMapping
    public List<User> findAll(){
       List<User> result= reposotory.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result= reposotory.findById(id).get();
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user){
        User result= reposotory.save(user);
        return result;
    }

}
