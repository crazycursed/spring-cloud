package com.example.demo.controller;


import com.baiye.spring.cloud.databases.entity.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping(value = "getInfo",produces = "application/json")
    public Teacher getTeacherInfo(Long id){
        return teacherService.getTeacherInfoById(id);
    }
}
