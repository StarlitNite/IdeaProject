package com.example.service;

import com.example.dao.UserInfoDao;
import com.example.model.ResultInfo;
import com.example.po.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;

@Service
public class UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    /**
     * * Service层：（业务逻辑层：判断数据、数据处理）（具体功能实现
     *         1.参数判断（判断参数是否为空）
     *             如果参数为空，设置ResultInfo对象（code=500，msg=xxx不能为空），并返回
     *             如果参数不为空
     *         2.调用Dao层的查询方法，通过用户名查询用户记录，返回用户对象
     *         3.判断用户对象是否为空
     *             如果用户对象为空，设置ResultInfo对象（code=500，msg=用户名不存在），并返回
     *         4.判断密码是否正确（判断客户端传递的密码与数据库中查询到的密码是否相等）
     *             如果密码不正确，设置ResultInfo对象（code=500，msg=用户密码不正确），并返回
     *         5.登录成功，设置ResultInfo对象（code=200，msg=登录成功），并返回
     * @param userName
     * @param userPwd
     * @return
     */

    public ResultInfo userLogin(String userName,String userPwd){
        ResultInfo resultInfo = new ResultInfo();//需要返回ResultInfo类型的数据 所以就提前写好 最后return resultInfo; 封装对象 包含状态码和提示信息
        //1.参数判断（判断参数是否为空）
        if (isEmpty(userName)||isEmpty(userPwd)) {
            // 如果参数为空，设置ResultInfo对象（code=500，msg=xxx不能为空），并返回
            resultInfo.setCode(500);
            resultInfo.setMsg("用户名或密码不能为空");
            return resultInfo;
        }
        //2.调用Dao层的查询方法，通过用户名查询用户记录，返回用户对象
        UserInfo userInfo = userInfoDao.queryUserByName(userName);

        //3.判断用户对象是否为空
        if (userInfo == null){
            //如果用户对象为空，设置ResultInfo对象（code=500，msg=用户名不存在），并返回
            resultInfo.setCode(500);
            resultInfo.setMsg("用户名不存在");
            return resultInfo;
        }

        //4.判断密码是否正确（判断客户端传递的密码与数据库中查询的密码是否相等）
        if (!userPwd.equals(userInfo.getUserPwd())){//有个感叹号，两个不相等才会跳出。
            //如果密码不正确，设置ResultInfo对象（code=500，msg=用户密码不正确），并返回
            resultInfo.setCode(500);
            resultInfo.setMsg("用户密码不正确!");
            return resultInfo;
        }

        //5.登录成功，设置ResultInfo对象（code=200，msg=登录成功），并返回
        resultInfo.setCode(200);
        resultInfo.setMsg("登录成功！");
        return resultInfo;
    }


    /**
     * 判断字符串是否为空
     *      为空，返回true；否则返回false
     * @param str
     * @return
     */
    public Boolean isEmpty(String str){
            if (str == null || "".equals(str.trim())){
                return true;
            }
            return false;
    }
}
