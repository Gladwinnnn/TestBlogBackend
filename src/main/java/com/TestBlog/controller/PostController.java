package com.TestBlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TestBlog.entity.Post;
import com.TestBlog.service.PostService;

@RestController
@CrossOrigin(origins = "*")
public class PostController {
	
	@Autowired
	private PostService service;
	
	@PostMapping("/addpost")
	public Post addPost(@RequestBody Post post) {
		return service.savePost(post);
	}
	
	@PostMapping("/addposts")
	public List<Post> addPosts(@RequestBody List<Post> posts) {
		return service.savePosts(posts);
	}
	
	@GetMapping("/posts")
	public List<Post> findAllPosts() {
		return service.getPosts();
	}
	
	@GetMapping("/postById/{id}")
	public Post findPostById(@PathVariable int id) {
		return service.getPostById(id);
	}
	
	@GetMapping("/postByTitle/{title}")
	public Post findPostByTitle(@PathVariable String title) {
		return service.getPostByTitle(title);
	}
	
	@PutMapping("/updatePost")
	public Post updatePost(@RequestBody Post post) {
		return service.updatePost(post);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePost(@PathVariable int id) {
		return service.deletePost(id);
	}

}
