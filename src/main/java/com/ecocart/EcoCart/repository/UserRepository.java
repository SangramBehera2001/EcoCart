package com.ecocart.EcoCart.repository;

import com.ecocart.EcoCart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
