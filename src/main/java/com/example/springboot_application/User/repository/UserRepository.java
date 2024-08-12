package com.example.springboot_application.User.repository;

import com.example.springboot_application.User.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    /*Optional<User> findByEmail(String email);

    Optional<User> findByUserName(String name);*/
}
