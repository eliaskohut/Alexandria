package com.alexandria.alexandria.controllers;

import com.alexandria.alexandria.entities.User;
import com.alexandria.alexandria.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    UserService userService;

    @GetMapping("hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("getUsers")
    public String getUsers(){
        return userService.getUsers().toString();
    }
    @PostMapping("addUser")
    public User addUser(@RequestBody User user){
        userService.addUser(user);
        return user;
    }
}
