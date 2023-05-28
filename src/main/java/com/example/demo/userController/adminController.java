package com.example.demo.userController;

import com.example.demo.entities.user;
import com.example.demo.userDAO.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@RestController
@Controller
@CrossOrigin("*")
public class adminController {
   @Autowired
    private userServices userServ;
    @PostMapping(value="user/addUser/")
   /* @RequestMapping(
            value = "user/addUser/",
            produces = "application/json",
            method = {RequestMethod.POST})*/
    public String addUsers(@RequestBody user u)
    {
        userServ.addUser(u);
        return "done";
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
