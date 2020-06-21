package com.example.blogv2be.controller.api;

import com.example.blogv2be.dto.EmailDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.NotNull;

@RequestMapping("/api/v1/test/")
public interface TestInterface {
    @GetMapping("spi")
    public ResponseEntity<?> testSPI();

    @PostMapping("sendMail")
    @ApiOperation("Send Email")
    public ResponseEntity<?> sendMail(@NotNull @RequestBody EmailDTO emailDTO);
}
