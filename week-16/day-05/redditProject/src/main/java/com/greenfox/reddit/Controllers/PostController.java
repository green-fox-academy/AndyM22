package com.greenfox.reddit.Controllers;

import com.greenfox.reddit.Model.Post;
import com.greenfox.reddit.Service.PostService;
import com.greenfox.reddit.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/{userName}")
public class PostController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping({"", "/"})
    public String listAllPosts(Model model, @PathVariable String userName) {
        model.addAttribute("posts", this.postService.getAllByVotes());
        return "listPosts";
    }

    @PostMapping("/upgrade/{id}")
    public String upgradePost(@PathVariable("id") Long id) {
        this.postService.upgradeVotesByPostId(id);
        return "redirect:/{userName}";
    }

    @PostMapping("/degrade/{id}")
    public String degradePost(@PathVariable("id") Long id) {
        this.postService.degradeVotesByPostId(id);
        return "redirect:/{userName}";
    }

    @GetMapping("/addPost")
    public String addPostForm(Model model) {
        model.addAttribute("newPost", new Post());
        return "addPost";
    }

    @PostMapping("/addPost")
    public String addPostSubmit(@ModelAttribute("newPost") Post post) {
        post.setCreatedAt(new Date());
        this.postService.addPost(post);
        return "redirect:/{userName}";
    }

}
