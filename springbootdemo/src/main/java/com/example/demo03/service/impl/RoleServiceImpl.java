package com.example.demo03.service.impl;

import com.example.demo03.entity.Role;
import com.example.demo03.mapper.RoleMapper;
import com.example.demo03.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int deleteByPrimaryKey(Integer roleid) {
        this.roleMapper.deleteByPrimaryKey(roleid);
        return 1;
    }

    @Override
    public int insert(Role record) {
        this.roleMapper.insert(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        this.roleMapper.updateByPrimaryKey(record);
        return 1;
    }

    @Override
    public List<Role> query() {
        return this.roleMapper.query();
    }

    @Override
    public Role querySingle(int roleid) {
        return this.roleMapper.querySingle(roleid);
    }
}
