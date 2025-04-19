package com.ecocart.EcoCart.service;

import com.ecocart.EcoCart.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getuserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
    User getUserByUsername(String username);
}
