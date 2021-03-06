package com.gquitto.jornal.model.posts.dal;

import com.gquitto.jornal.model.posts.tables.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/post/")
public class PostsController {

    @Autowired
    PostRepository postRepository;

    @CrossOrigin
    @GetMapping("getAll")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @CrossOrigin
    @PostMapping("saveNew")
    public Post saveNewPost(@RequestBody Post newPost){
        if (newPost != null) {
            return postRepository.save(newPost);
        }else {
            return null;
        }
    }

    @CrossOrigin
    @PutMapping("updatePost")
    public Post updatePost(@RequestBody Post post) {
        if (post != null && post.getId() != null) {
            return postRepository.save(post);
        }else {
            return null;
        }
    }

    @CrossOrigin
    @DeleteMapping("deletePost")
    public void deletePost(@RequestBody Long id) {
        if (id != null) {
            postRepository.deleteById(id);
        }
    }
}
