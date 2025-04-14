package com.chatbot.supportbot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class User {
    @Id @GeneratedValue
    private Long id;
    @NonNull
    private String email;
    @NonNull
    private String password;
    private String role; // ADMIN or USER
}
