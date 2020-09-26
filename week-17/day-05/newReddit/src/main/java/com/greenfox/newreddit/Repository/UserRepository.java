package com.greenfox.newreddit.Repository;

import com.greenfox.newreddit.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByName(String name);

    boolean existsUserByName(String name);

    User findUserByEmail(String email);

}
