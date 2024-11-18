package com.example.ishiki.controller;

import com.example.ishiki.dto.UserDTO;
import com.example.ishiki.model.User;
import com.example.ishiki.model.schemas.LoginRequest;
import com.example.ishiki.model.schemas.MfaVerificationResponse;
import com.example.ishiki.service.JwtService;
import com.example.ishiki.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final UserService userService;
    private final JwtService jwtService;
    private final AuthenticationProvider authenticationProvider;

    public AuthController(UserService userService, JwtService jwtService, AuthenticationProvider authenticationProvider) {

        this.userService = userService;
        this.jwtService = jwtService;
        this.authenticationProvider = authenticationProvider;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Validated @RequestBody UserDTO user) {
        // Register User // Generate QR code using the Secret KEY
        try {
            return ResponseEntity.ok(userService.saveUser(user));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Something went wrong. Try again.");
        }
    }

    @PostMapping(value = "/login", produces = "application/json")
    public ResponseEntity<?> login(@Validated @RequestBody LoginRequest loginRequest) {
        try {
            Authentication authentication = authenticationProvider.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);
            User user = (User) authentication.getPrincipal();
            return ResponseEntity.ok(MfaVerificationResponse.builder()
                    .username(loginRequest.getUsername())
                    .tokenValid(Boolean.TRUE)
                    .authValid(Boolean.TRUE)
                    .mfaRequired(Boolean.TRUE)
                    .message("User Authenticated using username and Password")
                    .jwt(jwtService.generateToken(loginRequest.getUsername()))
                    .build());

        } catch (Exception e){
            return ResponseEntity.ok(MfaVerificationResponse.builder()
                    .username(loginRequest.getUsername())
                    .tokenValid(Boolean.FALSE)
                    .authValid(Boolean.FALSE)
                    .mfaRequired(Boolean.FALSE)
                    .message(e.getMessage())
                    .jwt("")
                    .build());
        }
    }


}
