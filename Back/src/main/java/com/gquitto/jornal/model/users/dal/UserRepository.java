package com.gquitto.jornal.model.users.dal;

import com.gquitto.jornal.model.posts.tables.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Post, Long> {
}
