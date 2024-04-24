package com.capstone.userservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequestDtos {
    private String emailId;
    private String password;
    private String name;

}
