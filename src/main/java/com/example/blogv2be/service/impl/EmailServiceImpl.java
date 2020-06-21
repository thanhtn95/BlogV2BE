package com.example.blogv2be.service.impl;

import com.example.blogv2be.dto.EmailDTO;
import com.example.blogv2be.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    JavaMailSender javaMailSender;
    @Override
    public void sendMail(EmailDTO emailDTO) {
        SimpleMailMessage smg = new SimpleMailMessage();
        smg.setTo(emailDTO.getReceivers());
        smg.setSubject(emailDTO.getSubject());
        smg.setText(emailDTO.getContent());

        javaMailSender.send(smg);
    }
}
