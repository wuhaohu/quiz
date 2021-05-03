package com.vmware.db.design.service.impl;

import com.vmware.db.design.mapper.RoleMapper;
import com.vmware.db.design.po.Role;
import com.vmware.db.design.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public Role findByid(Integer id) throws Exception {
        return roleMapper.selectByPrimaryKey(id);
    }
}
