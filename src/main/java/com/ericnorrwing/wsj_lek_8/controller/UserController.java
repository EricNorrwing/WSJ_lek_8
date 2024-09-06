package com.ericnorrwing.wsj_lek_8.controller;

import com.ericnorrwing.wsj_lek_8.model.User;
import com.ericnorrwing.wsj_lek_8.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers () {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody User user) {

        return ResponseEntity.ok(user);
    }
}
