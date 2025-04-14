package com.chatbot.supportbot.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbot.supportbot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

