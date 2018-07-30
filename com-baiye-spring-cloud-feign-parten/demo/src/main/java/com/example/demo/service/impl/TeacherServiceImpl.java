package com.example.demo.service.impl;

import com.baiye.spring.cloud.databases.entity.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Override
    public Teacher getTeacherInfoById(Long id) {
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName("yyyyyy");
        teacher.setAddress("yyyyy");
        return teacher;
    }
}
