package com.example.demo03.service;

import com.example.demo03.entity.Role;

import java.util.List;

public interface RoleService {

    int deleteByPrimaryKey(Integer roleid);

    int insert(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> query();

    Role querySingle(int roleid);
}
