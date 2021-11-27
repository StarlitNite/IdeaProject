package com.stufood.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 订单实体类
 */
import java.util.Date;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    private Integer orderId;//订单ID
    private String orderOwn;//收货人
    private String orderTel;//收货电话
    private String orderAddress;//收货地址
    private Date deliveryTime;//送达时间
    private Date orderTime;//订单时间
    private String remark;//备注
}
