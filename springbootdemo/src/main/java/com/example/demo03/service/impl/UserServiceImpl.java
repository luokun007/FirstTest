package com.example.demo03.service.impl;

import com.example.demo03.entity.User;
import com.example.demo03.mapper.UserMapper;
import com.example.demo03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User record) {
        this.userMapper.insert(record);
        return 1;
    }

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        this.userMapper.deleteByPrimaryKey(userid);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        this.userMapper.updateByPrimaryKey(record);
        return 1;
    }

    @Override
    public List<User> querAll() {
        List<User> li=userMapper.querAll();
        return li;
    }

    @Override
    public User querySingle(int userid) {
        return userMapper.querySingle(userid);
    }
}
