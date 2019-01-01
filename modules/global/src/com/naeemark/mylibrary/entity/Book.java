package com.naeemark.mylibrary.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|title")
@Table(name = "MYLIBRARY_BOOK")
@Entity(name = "mylibrary$Book")
public class Book extends StandardEntity {
    private static final long serialVersionUID = 2715738453754530215L;

    @NotNull
    @Column(name = "TITLE", nullable = false)
    protected String title;

    @NotNull
    @Column(name = "AUTHOR_NAME", nullable = false)
    protected String author_name;

    @NotNull
    @Column(name = "ISBN", nullable = false)
    protected String isbn;

    @NotNull
    @Column(name = "COVER_IMAGE_URL", nullable = false)
    protected String cover_image_url;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setCover_image_url(String cover_image_url) {
        this.cover_image_url = cover_image_url;
    }

    public String getCover_image_url() {
        return cover_image_url;
    }


}