package com.gquitto.jornal.model.posts.dal;

import com.gquitto.jornal.model.posts.tables.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {


}
