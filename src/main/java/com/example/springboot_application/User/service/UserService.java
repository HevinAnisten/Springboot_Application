package com.example.springboot_application.User.service;

import com.example.springboot_application.User.model.User;
import com.example.springboot_application.User.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    public UserRepository userRepository;

   /* @Autowired
    PasswordEncoder passwordEncoder;

   // private final AuthenticationManager authenticationManager;

    //private final JwtUtils jwtUtils;

    public String register(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User added successfully";
    }


    *//*public UserService(AuthenticationManager authenticationManager) {
    this.authenticationManager = authenticationManager;
    }*/
}
