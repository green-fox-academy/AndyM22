package com.greenfox.reddit.Model;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "votes", columnDefinition="bigint default 1")
    private long votes = 1;
    private String title;

    public Post() {

    }

    public Post(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public long getVotes() {
        return votes;
    }

    public void setVotes(long votes) {
        this.votes = votes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
