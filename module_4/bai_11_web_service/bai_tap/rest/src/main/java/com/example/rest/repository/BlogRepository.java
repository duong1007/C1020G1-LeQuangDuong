package com.example.rest.repository;




import com.example.rest.model.Blog;
import com.example.rest.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {

    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
    Page<Blog> findByOrderByLocalDateDesc(Pageable pageable);
    Blog findByName(String name);
    List<Blog> findAllByCategory(Category category);

}