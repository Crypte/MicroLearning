package com.example.ishiki.service;

import org.springframework.security.core.Authentication;

import java.text.ParseException;

public interface JwtService {
    String generateToken(String username) throws ParseException;
    Authentication validateToken(String token);
}