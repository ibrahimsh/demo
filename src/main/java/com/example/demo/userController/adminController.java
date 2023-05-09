package com.example.demo.userController;

import com.example.demo.entities.user;
import com.example.demo.userDAO.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
