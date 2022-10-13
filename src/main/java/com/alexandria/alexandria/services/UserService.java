package com.alexandria.alexandria.services;

import com.alexandria.alexandria.entities.User;
import com.alexandria.alexandria.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserService() {
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void addUser(User user) {
        if(userRepository.findByEmail(user.getEmail())==null && userRepository.findByUsername(user.getUsername())==null){
            userRepository.save(user);
        }

    }

    public void removeUser(User user) {
        userRepository.delete(user);
    }

}
