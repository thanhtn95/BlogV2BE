package com.example.blogv2be.service;

import com.example.blogv2be.model.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "oldBlogBE",
        url = "https://blog-pj--omegalul.herokuapp.com/api/"
)
@Service
public interface SPIServiceClient {
    @GetMapping(value = "/blogList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Blog>> getAllBlogs();
}
