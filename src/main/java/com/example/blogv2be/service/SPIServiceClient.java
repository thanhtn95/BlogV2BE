package com.example.blogv2be.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "oldBlogBE",
        url = ""
)
public interface SPIServiceClient {
}
