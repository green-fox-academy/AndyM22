package com.greenfox.newreddit.Service;

import com.greenfox.newreddit.Model.Post;
import com.greenfox.newreddit.Model.Rating;
import com.greenfox.newreddit.Model.User;
import com.greenfox.newreddit.Repository.PostRepository;
import com.greenfox.newreddit.Repository.RatingRepository;
import com.greenfox.newreddit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final RatingRepository ratingRepository;
    private final UserRepository userRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository, RatingRepository ratingRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.ratingRepository = ratingRepository;
        this.userRepository = userRepository;
    }


    @Override
    public List<Post> getAllPosts() {
        return this.postRepository.findAll();
    }

    @Override
    public void addPost(Post post) {
        this.postRepository.save(post);
    }

    @Override
    public void voteUp(Long userId, Long postId) {
        User user = this.userRepository.getOne(userId);
        Post post = this.postRepository.getOne(postId);
        Rating rating = this.ratingRepository.findByPostAndUser(post, user);

        if (rating == null) {
            rating = new Rating (user, post);
            this.ratingRepository.save(rating);
            post.setVotes(post.getVotes() + 1);
            this.postRepository.save(post);
            rating.setVote(1);
            this.ratingRepository.save(rating);
        } else if (rating.getVote() == -1) {
            post.setVotes(post.getVotes() + 1);
            this.postRepository.save(post);
            rating.setVote(0);
            this.ratingRepository.save(rating);
        } else if (rating.getVote() == 0) {
            post.setVotes(post.getVotes() + 1);
            this.postRepository.save(post);
            rating.setVote(1);
            this.ratingRepository.save(rating);
        }

    }


    @Override
    public void voteDown(Long userId, Long postId) {
        User user = this.userRepository.getOne(userId);
        Post post = this.postRepository.getOne(postId);
        Rating rating = this.ratingRepository.findByPostAndUser(post, user);

        if (rating == null) {
            rating = new Rating (user, post);
            this.ratingRepository.save(rating);
            post.setVotes(post.getVotes() - 1);
            this.postRepository.save(post);
            rating.setVote(-1);
            this.ratingRepository.save(rating);
        } else if (rating.getVote() == 1) {
            post.setVotes(post.getVotes() - 1);
            this.postRepository.save(post);
            rating.setVote(0);
            this.ratingRepository.save(rating);
        } else if (rating.getVote() == 0) {
            post.setVotes(post.getVotes() - 1);
            this.postRepository.save(post);
            rating.setVote(-1);
            this.ratingRepository.save(rating);
        }

    }

    @Override
    public List<Post> getAllPostsByVotes() {
        return this.postRepository.findAll().stream()
                .sorted(Comparator.comparingLong(Post::getVotes).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public int getNumberOfPages() {
        return (int)this.postRepository.count()/10;
    }

    @Override
    public List<Post> postsOnCurrentPage(Integer page) {
        return this.postRepository.getAllByOrderByVotesDesc(PageRequest.of(page, 10));
    }

}
