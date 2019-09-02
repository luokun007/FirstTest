package com.example.demo03.service.impl;
import com.example.demo03.entity.UserRole;
import com.example.demo03.mapper.UserRoleMapper;
import com.example.demo03.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        this.userRoleMapper.deleteByPrimaryKey(id);
        return 0;
    }

    @Override
    public int insert(UserRole record) {
        this.userRoleMapper.insert(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserRole record) {
        this.userRoleMapper.updateByPrimaryKey(record);
        return 0;
    }

    @Override
    public List<UserRole> query() {
        List<UserRole> li=userRoleMapper.query();
        return li;
    }

    @Override
    public List<UserRole> que02() {

        return this.userRoleMapper.que02();
    }
}
