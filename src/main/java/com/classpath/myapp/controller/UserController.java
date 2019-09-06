package com.classpath.myapp.controller;

import com.classpath.myapp.model.User;
import com.classpath.myapp.service.UserService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> fetchAllUsers(){
        return this.userService.getAllUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return this.userService.saveUser(user);
    }
}