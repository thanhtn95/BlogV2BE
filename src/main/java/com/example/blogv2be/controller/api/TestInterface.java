package com.example.blogv2be.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/test/")
public interface TestInterface {
    @GetMapping("spi")
    public ResponseEntity<?> testSPI();
}
