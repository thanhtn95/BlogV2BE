package com.example.blogv2be.controller.impl;

import com.example.blogv2be.controller.api.TestInterface;
import com.example.blogv2be.service.SPIServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestInterface {
    @Autowired
    SPIServiceClient spiServiceClient;
    @Override
    public ResponseEntity<?> testSPI() {
        ResponseEntity<?> responseEntity = spiServiceClient.getAllBlogs();
        String result = responseEntity.getBody().toString();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
