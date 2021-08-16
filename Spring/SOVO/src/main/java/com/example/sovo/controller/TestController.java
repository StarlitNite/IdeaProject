package com.example.sovo.controller;

import com.example.sovo.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/Test")
@Api("测试swagger接口")
public class TestController {

    @RequestMapping(path = "/getStudent",method = RequestMethod.GET)
    @ApiOperation("/根据学生id获取学生信息")
    @ApiImplicitParam(name = "id",value = "id",required = true,paramType = "query",dataType = "int")
    public Student getStudent(@RequestParam Integer id){
        Student student = new Student();
        student.setId(11);
        student.setAge(21);
        student.setName("全栈学习笔记");
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(11,student);
        return studentMap.get(id);
    }
}
