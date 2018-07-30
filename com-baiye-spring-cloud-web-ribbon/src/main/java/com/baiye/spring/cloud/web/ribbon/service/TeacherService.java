package com.baiye.spring.cloud.web.ribbon.service;

import com.baiye.spring.cloud.databases.entity.Teacher;

public interface TeacherService {

    Teacher getTeacherInfoById(Long id);

}
