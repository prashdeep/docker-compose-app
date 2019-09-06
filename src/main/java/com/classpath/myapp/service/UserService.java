package com.classpath.myapp.service;

import com.classpath.myapp.repository.UserRepository;
import com.classpath.myapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }

    public User saveUser(User user) {
        return this.userRepository.save(user);
    }
}