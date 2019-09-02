package com.example.demo03.service;

import com.example.demo03.entity.UserRole;

import java.util.List;

public interface UserRoleService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int updateByPrimaryKey(UserRole record);

    List<UserRole> query();

    List<UserRole> que02();
}
