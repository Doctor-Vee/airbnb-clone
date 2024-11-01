package com.vee.airbnb_clone.repository;

import com.vee.airbnb_clone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
