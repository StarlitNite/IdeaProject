package com.stufood.entity;

import lombok.Data;

/**
 * 菜品实体类
 */
@Data
public class Food {
    private String foodid;
    private String foodName;
    private Integer Price;
    private String material;
    private String photo;
}
