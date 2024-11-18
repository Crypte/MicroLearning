package com.example.ishiki.provider;
import com.example.ishiki.dao.UserDAO;
import com.example.ishiki.model.User;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final UserDAO userDAO;
    private final PasswordEncoder passwordEncoder;

    public CustomAuthenticationProvider(UserDAO userDAO, PasswordEncoder passwordEncoder) {
        this.userDAO = userDAO;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        Optional<User> userDetails = userDAO.findByUsername(username);
        if(userDetails.isPresent()){
            if (userDetails != null && passwordEncoder.matches(password, userDetails.get().getPassword())) {
                System.out.println("TROUVEEEEE");
                return new UsernamePasswordAuthenticationToken(userDetails.get(), password);
            } else {
                throw new BadCredentialsException("Invalid password");
            }
        } else {
            throw new UsernameNotFoundException("Username Not Found");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}