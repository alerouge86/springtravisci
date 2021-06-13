package com.alx.springtravisci.controller;

import com.alx.springtravisci.model.User;
import com.alx.springtravisci.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<User> all() {
        return userRepository.findAll();
    }

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return userRepository.save(user);
    }
}
