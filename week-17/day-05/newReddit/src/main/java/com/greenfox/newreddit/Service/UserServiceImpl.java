package com.greenfox.newreddit.Service;

import com.greenfox.newreddit.Model.User;
import com.greenfox.newreddit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User getUserByName(String name) {
        return this.userRepository.findUserByName(name);
    }

    @Override
    public User getUserById(long id) {
        return this.userRepository.findById(id).get();
    }

    @Override
    public boolean matchingPasswords(String password, String matchingPassword) {
        return password.equals(matchingPassword);
    }

    @Override
    public boolean userNameExists(String name) {
        return this.userRepository.existsUserByName(name);
    }

    @Override
    public void saveNewUser(User user) {
        this.userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return this.userRepository.findUserByEmail(email);
    }

}
