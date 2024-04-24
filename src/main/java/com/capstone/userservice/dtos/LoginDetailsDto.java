package com.capstone.userservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDetailsDto {
    private String email;
    private String password;
}
