package com.capstone.userservice.services;

import com.capstone.userservice.modals.Token;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User signUp(String email, String password, String name){
        return null;
    }

    public Token login(String email, String password){
        return null;
    }

    public void logout(Token token){
    }
}
