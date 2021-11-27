package com.stufood.model.vo;

import com.stufood.entity.Menu;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class MenuVo extends Menu{

    private List<Menu> menuslist;

}
