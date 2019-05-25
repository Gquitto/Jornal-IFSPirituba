package com.gquitto.jornal.model.posts.tables;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "posts")
public class Post {

    @Id
    private long id;

    private String title;

    private String body;

    private Long createdBy;

    private Long approvedBy;

    private String createdOn;

    private String lastUpdated;

}
