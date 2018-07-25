package com.baiye.spring.cloud.server.admin.service;

import com.baiye.spring.cloud.databases.entity.Teacher;

public interface TeacherService {
    Teacher getTeacherById(Long id);
}
