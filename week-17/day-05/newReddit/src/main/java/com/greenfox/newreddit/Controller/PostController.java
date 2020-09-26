package com.greenfox.newreddit.Controller;

import com.greenfox.newreddit.Model.Page;
import com.greenfox.newreddit.Model.Post;
import com.greenfox.newreddit.Service.PostService;
import com.greenfox.newreddit.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/post/{userId}")
public class PostController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }


    @GetMapping({"", "/"})
    public String getPosts (@PathVariable long userId,
                            /*@RequestParam int start,
                            @RequestParam int size,*/
                            Model model) {

        model.addAttribute("posts", this.postService.getAllPostsByVotes());
        model.addAttribute("user", this.userService.getUserById(userId));
        return "posts";
    }

    @GetMapping ("/addPost")
    public String addPostForm(@PathVariable long userId, Model model) {
        model.addAttribute("newPost", new Post());
        model.addAttribute("user", this.userService.getUserById(userId));
        return "addPost";
    }

    @PostMapping("/addPost")
    public String submitAddPostForm(@PathVariable long userId, @ModelAttribute Post newPost) {
        newPost.setCreatedAt(new Date());
        newPost.setUser(this.userService.getUserById(userId));
        this.postService.addPost(newPost);
        return "redirect:/post/" + userId;
    }

    @PostMapping("/voteUp/{postId}")
    public String voteUpSubmit(@PathVariable long userId, @PathVariable long postId) {
        this.postService.voteUp(userId, postId);
        return "redirect:/post/" + userId;
    }

    @PostMapping ("/voteDown/{postId}")
    public String voteDownSubmit(@PathVariable long userId, @PathVariable long postId) {
        this.postService.voteDown(userId, postId);
        return "redirect:/post/" + userId;
    }

}
