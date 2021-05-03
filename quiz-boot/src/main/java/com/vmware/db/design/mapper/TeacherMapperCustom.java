package com.vmware.db.design.mapper;

import com.vmware.db.design.po.TeacherCustom;

import java.util.List;

public interface TeacherMapperCustom {

    //分页查询老师信息
    List<TeacherCustom> findByPaging() throws Exception;

    //根据姓名模糊查找
    List<TeacherCustom> selectByName(TeacherCustom teacherCustom) throws Exception;

    //获取
}
