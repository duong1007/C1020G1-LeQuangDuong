package com.example.blog_one_to_many.repository;

import com.example.blog_one_to_many.model.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogUserRepository extends JpaRepository<BlogUser,Long> {
    BlogUser findByUserName(String name);
}
