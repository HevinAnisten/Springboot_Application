package com.example.springboot_application.User.controller;

import com.example.springboot_application.User.model.User;
import com.example.springboot_application.User.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(){
        return "Api works successfully.";
    }

  /*  @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
        System.out.println(user);
        return ResponseEntity.ok().body(userService.register(user));
    }*/

}
