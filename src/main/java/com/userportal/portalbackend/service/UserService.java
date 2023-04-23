package com.userportal.portalbackend.service;

import com.userportal.portalbackend.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public Optional<User> getUser(Long id);
    public List<User> getAllUsers();
    public void deleteUser(Long id);
    public User updateUser(User user);
    public User saveUser(User user);
}
