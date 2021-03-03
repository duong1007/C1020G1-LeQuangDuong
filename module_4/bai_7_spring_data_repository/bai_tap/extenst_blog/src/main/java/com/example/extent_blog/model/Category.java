package com.example.extent_blog.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
// mappedBy tên đối tượng, join column tên khóa ngoại liên kết, referentColumn tên khóa chính liên kết
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<BlogCategory> blogCategories;

    public Category() {
    }

    public List<BlogCategory> getBlogCategories() {
        return blogCategories;
    }

    public void setBlogCategories(List<BlogCategory> blogCategories) {
        this.blogCategories = blogCategories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
