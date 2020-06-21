package com.example.blogv2be.service;

import com.example.blogv2be.dto.EmailDTO;

public interface EmailService {
    void sendMail(EmailDTO emailDTO);
}
