package com.stufood.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 商家信息实体类
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Shop {
    private Integer shopId;
    private String shopName;
    private String shopTel;
    private Date openTime;
}
