package com.baiye.spring.cloud.web.ribbon.service.impl;

import com.baiye.spring.cloud.databases.entity.Teacher;
import com.baiye.spring.cloud.web.ribbon.service.TeacherService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "errorFallback")
    @Override
    public Teacher getTeacherInfoById(Long id) {
        return restTemplate.getForObject("http://spring-cloud-server-admin-producer/teacher/getTeacher",Teacher.class,id);
    }

    public Teacher errorFallback(Long id){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName("xxxxx");
        teacher.setAddress("xxxxxxx");
        return  teacher;
    }
}
