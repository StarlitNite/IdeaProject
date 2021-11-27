package com.stufood.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Data
public class Menu {
    private Integer menuId;//菜单ID
    private Integer parentId;//父ID
    private String path;//地址
    private String url;//

    private String component;//*/
    private String authName;//
/*    private Boolean keepalive;//
    private Boolean requireauth;//
    private Boolean enabled;//*/
    private List<Menu> children;//嵌套子数列

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", parentId=" + parentId +
                ", path='" + path + '\'' +
                ", url='" + url + '\'' +
                ", component='" + component + '\'' +
                ", authName='" + authName + '\'' +
                ", children=" + children +
                '}';
    }
}
