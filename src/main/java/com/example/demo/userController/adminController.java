package com.example.demo.userController;

import com.example.demo.entities.user;
import com.example.demo.userDAO.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.ArrayList;

@RestController
@Controller
public class adminController {
   @Autowired
    private userServices userServ;
    @PostMapping(value="user/addUser/")
    public @ResponseBody user addUsers(@RequestBody user u)
    {
        return userServ.addUser(u);
    }

    @GetMapping(value = "user/getAll")
    public ArrayList<user> getAll()
    {
        return userServ.getAll();
    }
    @PostMapping( value="user/updateUser")
    public @ResponseBody user updateUser(user u)
    {
       return userServ.update(u);
    }
}
