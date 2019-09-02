package com.example.demo03.controller;

import com.example.demo03.entity.Role;
import com.example.demo03.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/spring02")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/query")
    public List<Role> que(){
        return this.roleService.query();
    }

    @PostMapping("/add")
    public String add(Role role){
        roleService.insert(role);
        return "ok";
    }

    @GetMapping("/dele/{roleid}")
    public String dele(@PathVariable  int roleid){
        this.roleService.deleteByPrimaryKey(roleid);
        return "ok";
    }

    @PostMapping("/update")
    public String updateUser(Role role){
        this.roleService.updateByPrimaryKey(role);
        return "ok";
    }

}
