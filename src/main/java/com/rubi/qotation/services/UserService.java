package com.rubi.qotation.services;

import com.rubi.qotation.entities.User;
import com.rubi.qotation.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public User saveUser(User user){
        return userRepo.save(user);
    }
}
