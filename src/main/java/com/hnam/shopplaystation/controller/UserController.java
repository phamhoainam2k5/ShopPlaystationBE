package com.hnam.shopplaystation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hnam.shopplaystation.dto.UserDTO;
import com.hnam.shopplaystation.entity.User;
import com.hnam.shopplaystation.service.IUserService;

@RestController
@RequestMapping("/api/users/")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDTO userDTO) {
        userService.registerUser(userDTO);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestParam String email, @RequestParam String password) {
        User user = userService.loginUser(email, password);
        return ResponseEntity.ok(user);
    }
}
