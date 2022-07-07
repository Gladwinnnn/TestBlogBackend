package com.TestBlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestBlog.entity.Post;
import com.TestBlog.repository.PostRepository;

import java.util.*;

@Service
public class PostService {
	@Autowired
	private PostRepository repository;
	
	public Post savePost(Post post) {
		return repository.save(post);
	}
	
	public List<Post> savePosts(List<Post> posts) {
		return repository.saveAll(posts);
	}
	
	public List<Post> getPosts() {
		return repository.findAll();
	}
	
	public Post getPostById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Post getPostByTitle(String title) {
		return repository.findByTitle(title);
	}
	
	public String deletePost(int id) {
		repository.deleteById(id);
		return "Post removed!";
	}
	
	public Post updatePost(Post post) {
		Post existingPost = repository.findById(post.getPostId()).orElse(null);
		existingPost.setTitle(post.getTitle());
		existingPost.setContent(post.getContent());
		return repository.save(existingPost);
		
	}
}
