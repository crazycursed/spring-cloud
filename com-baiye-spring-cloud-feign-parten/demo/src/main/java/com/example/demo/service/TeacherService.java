package com.example.demo.service;


import com.baiye.spring.cloud.databases.entity.Teacher;
import com.example.demo.service.impl.TeacherServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "spring-cloud-server-admin-producer",fallback = TeacherServiceImpl.class)
public interface TeacherService {

    @PostMapping(value = "getInfo",produces = "application/json")
    Teacher getTeacherInfoById(Long id);
}
