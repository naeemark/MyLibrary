package com.naeemark.mylibrary.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "MYLIBRARY_READER")
@Entity(name = "mylibrary$Reader")
public class Reader extends StandardEntity {
    private static final long serialVersionUID = -3506836093984843190L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "PICTURE_URL", nullable = false)
    protected String picture_url;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    protected Date date_of_birth;

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public String getPicture_url() {
        return picture_url;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }


}