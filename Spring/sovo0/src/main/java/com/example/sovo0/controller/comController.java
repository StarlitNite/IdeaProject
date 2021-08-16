package com.example.sovo0.controller;

import com.example.sovo0.service.comService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/com")
public class comController {

    @Resource
    private comService comService;


}
