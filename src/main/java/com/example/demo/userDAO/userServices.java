package com.example.demo.userDAO;

import com.example.demo.entities.user;
import com.example.demo.repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServices {
    @Autowired
    private usersRepository uRepos;
    public user addUser(user u)
    {
        return uRepos.save(u);
    }

}
