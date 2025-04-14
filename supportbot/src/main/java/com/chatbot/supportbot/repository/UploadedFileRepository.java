package com.chatbot.supportbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbot.supportbot.model.UploadedFile;

public interface UploadedFileRepository extends JpaRepository<UploadedFile, Long> {}

