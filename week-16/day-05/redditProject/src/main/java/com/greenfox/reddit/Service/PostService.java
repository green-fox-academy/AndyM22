package com.greenfox.reddit.Service;

import com.greenfox.reddit.Model.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllByVotes();

    Post getPostById(Long id);

    void degradeVotesByPostId(Long id);

    void upgradeVotesByPostId(Long id);

}
