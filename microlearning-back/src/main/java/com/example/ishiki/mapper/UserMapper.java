package com.example.ishiki.mapper;

import com.example.ishiki.dto.UserDTO;
import com.example.ishiki.model.User;

public class UserMapper {
    public static User fromUserDTO(UserDTO dto, Long id) {
        return new User.Builder()
                .username(dto.getUsername())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .subscriptionType(dto.getSubscriptionType())
                .createdAt(dto.getCreatedAt())
                .role(dto.getRole())
                .build();
    }


    public static UserDTO toUserDTO(User user) {
        return UserDTO.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .username(user.getUsername())
                .email(user.getEmail())
                .subscriptionType(user.getSubscription_type())
                .createdAt(user.getCreated_at()).build();
    }
}
