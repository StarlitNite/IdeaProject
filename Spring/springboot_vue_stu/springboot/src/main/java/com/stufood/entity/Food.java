package com.stufood.entity;

import lombok.Data;

/**
 * 菜品实体类
 */
@Data
public class Food {
    private String foodId;
    private String shopId;
    private String foodName;
    private String catId;
    private Integer Price;
    private String material;
    private String picture;
}
