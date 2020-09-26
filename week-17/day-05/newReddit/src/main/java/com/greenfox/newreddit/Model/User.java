package com.greenfox.newreddit.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String password;
    private String passwordMatch;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> posts;

    public User() {
    }

    public User(String name, String email, String password, String passwordMatch) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.passwordMatch = passwordMatch;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public long getId() {
        return id;
    }

    public String getPasswordMatch() {
        return passwordMatch;
    }

    public void setPasswordMatch(String passwordMatch) {
        this.passwordMatch = passwordMatch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
