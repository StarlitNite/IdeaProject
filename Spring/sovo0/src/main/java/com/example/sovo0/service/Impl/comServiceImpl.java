package com.example.sovo0.service.Impl;

import com.example.sovo0.dao.comMapper;
import com.example.sovo0.entity.com;
import com.example.sovo0.service.comService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class comServiceImpl implements comService {

    @Resource
    private comMapper comMapper;

    @Override
    public com queryComByName(String comName) {
        com com = comMapper.queryComByName(comName);
        return com;
    }
}
