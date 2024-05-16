package com.myblog.myblog1111.repository;

import com.myblog.myblog1111.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
