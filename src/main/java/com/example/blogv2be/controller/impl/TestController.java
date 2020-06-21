package com.example.blogv2be.controller.impl;

import com.example.blogv2be.controller.api.TestInterface;
import com.example.blogv2be.model.Blog;
import com.example.blogv2be.service.SPIServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController implements TestInterface {
    @Autowired
    SPIServiceClient spiServiceClient;
    @Override
    public ResponseEntity<?> testSPI() {
        ResponseEntity<List<Blog>> responseEntity = spiServiceClient.getAllBlogs();
        List<Blog> result = responseEntity.getBody();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
