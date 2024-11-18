package com.example.ishiki.model.schemas;
import lombok.Data;

@Data
public class LoginRequest {
    String username;
    String password;
}
