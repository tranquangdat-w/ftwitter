package com.ftwitter.wangdat.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftwitter.wangdat.models.User;
import com.ftwitter.wangdat.services.UserService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
@Getter
@Setter
public class AuthenticationController {
    private final UserService userService;

    // go to http://localhost:8000/auth/register
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
}
