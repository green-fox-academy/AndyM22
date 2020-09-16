package com.greenfox.reddit.Service;

import com.greenfox.reddit.Model.User;
import com.greenfox.reddit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //uloží registrační data uživatele do databáze
    @Override
    public User saveNewUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User getUserByName(String name) {
        return this.userRepository.findUserByName(name);
    }

    @Override
    public boolean isEmailValid(String email) {
        if (email == null) {
            return false;
        } else {
            String emailRegex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
            Pattern emailPattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = emailPattern.matcher(email);
            return matcher.find();
        }
    }

    @Override
    public boolean isPasswordValid(String password, String name) {
       return this.userRepository.findUserByName(name).getPassword().equals(password);
    }

    @Override
    public User getUserById(Long id) {
        return this.userRepository.findById(id).get();
    }

}
