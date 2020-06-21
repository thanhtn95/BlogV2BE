package com.example.blogv2be.controller.impl;

import com.example.blogv2be.controller.api.TestInterface;
import com.example.blogv2be.dto.EmailDTO;
import com.example.blogv2be.model.Blog;
import com.example.blogv2be.model.constant.BlogSourceEnum;
import com.example.blogv2be.service.BlogService;
import com.example.blogv2be.service.EmailService;
import com.example.blogv2be.service.SPIServiceClient;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class TestController implements TestInterface {
    @Autowired
    SPIServiceClient spiServiceClient;
    @Autowired
    BlogService blogService;
    @Autowired
    EmailService emailService;
    @Override
    @ApiOperation("Test SPI Service")
    public ResponseEntity<?> testSPI() {
        ResponseEntity<List<Blog>> responseEntity = spiServiceClient.getAllBlogs();
        List<Blog> result = responseEntity.getBody();
        for (Blog blog: result
             ) {
            blog.setSource(BlogSourceEnum.OLD_BLOG);
        }
        result = blogService.saveAll(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> sendMail(@NotNull EmailDTO emailDTO) {
        emailService.sendMail(emailDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
