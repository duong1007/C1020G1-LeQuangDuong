package com.example.extent_blog.model;

import javax.persistence.*;

@Entity
@Table(name = "blog_category")
public class BlogCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @EmbeddedId
//    private CategoryRatingKey id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @MapsId("blog_id")
    @JoinColumn(name = "blog_id")
    private Blog blog;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @MapsId("category_id")
    @JoinColumn(name = "category_id")
    private Category category;

    public BlogCategory() {
    }

    public BlogCategory(Category category) {
        this.category = category;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


//    public CategoryRatingKey getId() {
//        return id;
//    }
//
//    public void setId(CategoryRatingKey id) {
//        this.id = id;
//    }



    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
