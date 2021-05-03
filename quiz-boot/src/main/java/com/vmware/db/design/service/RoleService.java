package com.vmware.db.design.service;

import com.vmware.db.design.po.Role;

/**
 *  Role 权限表Service层
 */
public interface RoleService {

    Role findByid(Integer id) throws Exception;

}
