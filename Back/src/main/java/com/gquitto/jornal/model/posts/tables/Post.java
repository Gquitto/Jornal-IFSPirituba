package com.gquitto.jornal.model.posts.tables;

import com.gquitto.jornal.model.users.tables.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    private long id;

    private String title;

    private String body;

    private User writtenBy;

    private String createdOn;

    private String lastUpdated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getWrittenBy() {
        return writtenBy;
    }

    public void setWrittenBy(User writtenBy) {
        this.writtenBy = writtenBy;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
