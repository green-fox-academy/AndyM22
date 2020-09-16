package com.greenfox.reddit.Service;

import com.greenfox.reddit.Model.User;

public interface UserService {

    User saveNewUser(User user);

    User getUserByName(String name);

    boolean isEmailValid(String email);

    boolean isPasswordValid(String password, String name);

    User getUserById(Long id);

}
