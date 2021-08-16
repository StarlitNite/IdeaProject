package com.example.sovo0.dao;

import com.example.sovo0.entity.com;
import org.mapstruct.Mapper;

@Mapper
public interface comMapper {

    //通过公司名称查找公司
    public com queryComByName(String comName);
}
