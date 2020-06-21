package com.example.blogv2be.service.impl;

import com.example.blogv2be.model.Blog;
import com.example.blogv2be.repository.BlogRepository;
import com.example.blogv2be.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> saveAll(List<Blog> blogs) {
        List<Blog> result = blogRepository.saveAll(blogs);
        return result;
    }
}
