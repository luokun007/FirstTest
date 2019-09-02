package com.example.demo03.controller;

import com.example.demo03.entity.UserRole;
import com.example.demo03.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/spring03")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    @PostMapping("/add")
    public String add(UserRole userRole){
        userRoleService.insert(userRole);
        return "ok";
    }

    @GetMapping("/dele/{id}")
    public String dele(@PathVariable int id){
        this.userRoleService.deleteByPrimaryKey(id);
        return "ok";
    }

    @PostMapping("/update")
    public String updateUser(UserRole userRole){
        this.userRoleService.updateByPrimaryKey(userRole);
        return "ok";
    }

    @GetMapping("/query")
    public List<UserRole> que(){
        return this.userRoleService.query();
    }

    @GetMapping("/query02")
    public List<UserRole> que02(){
        return this.userRoleService.que02();
    }
}
