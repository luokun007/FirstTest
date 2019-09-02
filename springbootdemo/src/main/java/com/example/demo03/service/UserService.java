package com.example.demo03.service;

import com.example.demo03.entity.User;

import java.util.List;

public interface UserService {
    int insert(User record);

    int deleteByPrimaryKey(Integer userid);

    int updateByPrimaryKey(User record);

    List<User> querAll();

    User querySingle(int userid);
    
}
