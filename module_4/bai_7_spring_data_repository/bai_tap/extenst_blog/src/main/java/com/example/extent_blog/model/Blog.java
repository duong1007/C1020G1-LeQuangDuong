package com.example.extent_blog.model;


import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    private String content;

    @Column(columnDefinition = "datetime")
    private String localDate;

    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    private List<BlogCategory> blogCategories;

    public Blog() {
    }


    public List<BlogCategory> getBlogCategories() {
        return blogCategories;
    }

    public void setBlogCategories(List<BlogCategory> blogCategories) {
        this.blogCategories = blogCategories;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
