package com.userportal.portalbackend.controller;

import com.userportal.portalbackend.model.User;
import com.userportal.portalbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @GetMapping("/test")
    public String Test() {
        return "Testing API";
    }

    @Autowired
    UserService service;

    @GetMapping("/getallusers")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/getuser/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return service.getUser(id);
    }

    @PostMapping("/saveuser")
    public User saveUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PutMapping("/updateuser")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return "user has been deleted!";
    }
}
