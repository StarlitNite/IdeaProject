package com.example.model;

/**
 * 返回的封装对象
 *  用来存放 状态及提示信息
 */
public class ResultInfo {
    private Integer code;// 状态码（200=成功，500=失败）
    private String msg;//提示信息

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResultInfo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
