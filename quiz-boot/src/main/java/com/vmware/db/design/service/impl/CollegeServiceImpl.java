package com.vmware.db.design.service.impl;

import com.vmware.db.design.mapper.CollegeMapper;
import com.vmware.db.design.po.College;
import com.vmware.db.design.po.CollegeExample;
import com.vmware.db.design.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeMapper collegeMapper;

    @Cacheable(value = "collegeList",key = "methodName")
    public List<College> finAll() throws Exception {
        CollegeExample collegeExample = new CollegeExample();
        CollegeExample.Criteria criteria = collegeExample.createCriteria();

        criteria.andCollegeidIsNotNull();
        System.out.println("111111查询数据库");

        return collegeMapper.selectByExample(collegeExample);
    }
}
