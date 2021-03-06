package com.vmware.db.design.mapper;

import com.vmware.db.design.po.CourseCustom;

import java.util.List;


public interface CourseMapperCustom {

    //分页查询学生信息
    List<CourseCustom> findByPaging() throws Exception;

    //根据姓名模糊查找
    List<CourseCustom> selectByName(CourseCustom courseCustom) throws Exception;

}
