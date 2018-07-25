package com.baiye.spring.cloud.server.admin.service.impl;

import com.baiye.spring.cloud.databases.entity.Teacher;
import com.baiye.spring.cloud.server.admin.dao.TeacherMapper;
import com.baiye.spring.cloud.server.admin.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher getTeacherById(Long id) {
        return teacherMapper.selectByPrimaryKey(id);
    }
}
