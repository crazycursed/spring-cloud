package com.baiye.spring.cloud.datasource.many.produce.controller;

import com.baiye.spring.cloud.databases.entity.Teacher;
import com.baiye.spring.cloud.datasource.many.produce.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping(value = "getTeacherInfo", produces = "application/json")
    public Teacher getTeacherInfo(Long id){
        return teacherService.getTeacherInfoById(id);
    }
}
