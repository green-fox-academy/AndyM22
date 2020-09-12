package com.greenfox.reddit.Controllers;

import com.greenfox.reddit.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping ("/")
    public String listAllPosts(Model model) {
        model.addAttribute("posts", this.postService.getAllByVotes());
        return "listPosts";
    }

    @PostMapping("/upgrade/{id}")
    public String upgradePost(@PathVariable("id") Long id){
        this.postService.upgradeVotesByPostId(id);
        return "redirect:/";
    }

    @PostMapping("/degrade/{id}")
    public String degradePost(@PathVariable("id") Long id){
        this.postService.degradeVotesByPostId(id);
        return "redirect:/";
    }

}
