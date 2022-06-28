package com.TestBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TestBlog.entity.Post;

public interface PostRepository extends JpaRepository<Post,Integer>{
	Post findByTitle(String Name);
}