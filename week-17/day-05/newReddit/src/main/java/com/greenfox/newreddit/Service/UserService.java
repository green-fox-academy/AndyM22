package com.greenfox.newreddit.Service;


import com.greenfox.newreddit.Model.User;

public interface UserService {

    User getUserByName(String name);

    User getUserById(long id);

    boolean matchingPasswords(String password, String matchingPassword);

    boolean userNameExists(String name);

    void saveNewUser(User user);

    User findUserByEmail(String email);

}
