package com.example.demo03.controller;

import com.example.demo03.entity.User;
import com.example.demo03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/spring")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(User user){
        userService.insert(user);
        return "ok";
    }

    @GetMapping("/dele/{userid}")
    public String dele(@PathVariable int userid){
        this.userService.deleteByPrimaryKey(userid);
        return "ok";
    }

    @PostMapping("/update")
    public String updateUser(User user){
        this.userService.updateByPrimaryKey(user);
        return "ok";
    }

    @GetMapping("/query")
    public List<User> queAll(){
        List<User> li=userService.querAll();
        return li;
    }
}
