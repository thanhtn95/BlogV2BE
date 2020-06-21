package com.example.blogv2be.service;

import com.example.blogv2be.model.Blog;

import java.util.List;

public interface BlogService {
    public List<Blog> saveAll(List<Blog> blogs);
}
