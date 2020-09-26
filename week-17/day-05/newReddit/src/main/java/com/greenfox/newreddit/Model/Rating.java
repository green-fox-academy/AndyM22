package com.greenfox.newreddit.Model;


import javax.persistence.*;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long vote;

    @ManyToOne
    private User user;

    @ManyToOne
    private Post post;

    public Rating() {
    }

    public Rating(User user, Post post) {
        this.user = user;
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public long getVote() {
        return vote;
    }

    public void setVote(long vote) {
        this.vote = vote;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
