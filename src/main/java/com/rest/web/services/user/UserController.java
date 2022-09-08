package com.rest.web.services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> findAll(){
        return userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable int id){
        return userDaoService.findById(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        userDaoService.saveUser(user);
    }
}
