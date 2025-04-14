package com.chatbot.supportbot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UploadedFile {
    @Id @GeneratedValue
    private Long id;
    private String filename;
    private String fileType;
    private String url;

    @ManyToOne
    private User user;
}
