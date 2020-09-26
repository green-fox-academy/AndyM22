package com.greenfox.newreddit.Repository;

import com.greenfox.newreddit.Model.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> getAllByOrderByVotesDesc(Pageable pageable);

}
