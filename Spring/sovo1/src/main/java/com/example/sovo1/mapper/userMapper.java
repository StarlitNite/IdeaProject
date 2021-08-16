package com.example.sovo1.mapper;


import com.example.sovo1.emtity.user;
import com.example.sovo1.emtity.vo.userVo;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface userMapper {

    public userVo login(@Param("username") String username,
                        @Param("password") String password);

    public user register(@Param("username") String username,
                         @Param("password") String password,
                         @Param("ident")String ident);
}
