package com.baiye.spring.cloud.server.admin.controller.api;

import com.baiye.spring.cloud.databases.entity.Teacher;
import com.baiye.spring.cloud.server.admin.service.TeacherService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/teacher")
public class ApiTeacherController {


    @Autowired
    private TeacherService teacherService;


    @RequestMapping(value = "getTeacher",method = RequestMethod.GET,produces = "application/json" )
    public Teacher getTeacherInfoById(Long id){
        System.out.println("获取教师ID"+id);
        return  teacherService.getTeacherById(id);
    }

    @GetMapping(value ="test",produces = "application/json")
    public String test(){
        return  "Hello World!";
    }
}
