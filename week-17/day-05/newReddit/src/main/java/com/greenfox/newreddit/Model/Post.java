package com.greenfox.newreddit.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String url;
    @Temporal(value = TemporalType.DATE)
    private Date createdAt;
    @Column(name = "votes", columnDefinition="bigint default 1")
    private long votes = 1;

    @ManyToOne
    private User user;

    public Post() {
    }

    public Post(String title, String url, User user) {
        this.title = title;
        this.url = url;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public long getVotes() {
        return votes;
    }

    public void setVotes(long votes) {
        this.votes = votes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
