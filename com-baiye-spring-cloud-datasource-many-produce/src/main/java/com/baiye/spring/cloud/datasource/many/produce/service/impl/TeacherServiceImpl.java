package com.baiye.spring.cloud.datasource.many.produce.service.impl;

import com.baiye.spring.cloud.databases.entity.Teacher;
import com.baiye.spring.cloud.datasource.many.produce.config.DS;
import com.baiye.spring.cloud.datasource.many.produce.dao.TeacherMapper;
import com.baiye.spring.cloud.datasource.many.produce.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherMapper teacherMapper;

    @DS("onedatasource")
    @Override
    public Teacher getTeacherInfoById(Long id) {
        return teacherMapper.selectByPrimaryKey(id);
    }
}
