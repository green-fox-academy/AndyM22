package com.greenfox.reddit.Service;

import com.greenfox.reddit.Model.Post;
import com.greenfox.reddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAllByVotes() {
        return this.postRepository.findAll().stream()
                .sorted(Comparator.comparingLong(Post::getVotes).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public Post getPostById(Long id) {
        return this.postRepository.getOne(id);
    }

    @Override
    public void degradeVotesByPostId(Long id) {
        Post post = getPostById(id);
        post.setVotes(post.getVotes() - 1);
        this.postRepository.save(post);
    }

    @Override
    public void upgradeVotesByPostId(Long id) {
        Post post = getPostById(id);
        post.setVotes(post.getVotes() + 1);
        this.postRepository.save(post);
    }

    @Override
    public Post addPost(Post post) {
        this.postRepository.save(post);
        return null;
    }

}
