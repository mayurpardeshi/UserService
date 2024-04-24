package com.capstone.userservice.controllers;

import com.capstone.userservice.dtos.LoginDetailsDto;
import com.capstone.userservice.dtos.LogoutRequestDto;
import com.capstone.userservice.dtos.SignUpRequestDtos;
import com.capstone.userservice.dtos.UserDto;
import com.capstone.userservice.modals.Token;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping("/signup")
    public UserDto signUp(@RequestBody SignUpRequestDtos signUpRequestDtos){
        return null;
    }

    @PostMapping("/login")
    public Token login(@RequestBody LoginDetailsDto loginDetailsDto){
        return null;
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout(@RequestBody LogoutRequestDto logoutRequestDto){
        return null;
    }
}
