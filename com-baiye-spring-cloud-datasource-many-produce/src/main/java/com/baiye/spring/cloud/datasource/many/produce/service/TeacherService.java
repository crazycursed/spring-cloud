package com.baiye.spring.cloud.datasource.many.produce.service;

import com.baiye.spring.cloud.databases.entity.Teacher;


public interface TeacherService {
    Teacher getTeacherInfoById(Long id);
}
