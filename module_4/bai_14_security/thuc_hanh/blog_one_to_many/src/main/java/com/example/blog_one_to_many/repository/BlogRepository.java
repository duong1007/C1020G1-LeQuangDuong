package com.example.blog_one_to_many.repository;



import com.example.blog_one_to_many.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {

    Page<Blog> findAllByNameContaining(String name, Pageable pageable);

}