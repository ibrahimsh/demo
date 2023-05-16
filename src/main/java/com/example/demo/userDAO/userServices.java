package com.example.demo.userDAO;

import com.example.demo.entities.user;
import com.example.demo.repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class userServices {
    @Autowired
    private usersRepository uRepos;
    public user addUser(user u)
    {

        return uRepos.save(u);
    }
    public ArrayList<user> getAll()
    {
        return (ArrayList<user>) uRepos.findAll();
    }
    public user update(user id)
    {

        return uRepos.save(id);
    }
}
