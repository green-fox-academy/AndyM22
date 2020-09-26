package com.greenfox.newreddit.Repository;

import com.greenfox.newreddit.Model.Post;
import com.greenfox.newreddit.Model.Rating;
import com.greenfox.newreddit.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

    Rating findByPostAndUser(Post post, User user);

}
