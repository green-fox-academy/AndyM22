package com.greenfox.newreddit.Service;

import com.greenfox.newreddit.Model.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts();

    void addPost(Post post);

    void voteUp(Long userId, Long postId);

    void voteDown(Long userId, Long postId);

    List<Post> getAllPostsByVotes();

    List<Post>getAllPostsByVotesPaginated(int start, int size);

    void nextPage();

}
