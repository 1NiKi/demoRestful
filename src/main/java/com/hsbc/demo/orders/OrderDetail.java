package com.hsbc.demo.orders;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @ClassName OrderDetail
 * @Description: 订单详情
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 16:38
 **/
@Getter
@Setter
@RequiredArgsConstructor
public class OrderDetail {

    @Id
    private String detailId;

    /** 订单id . */
    private String orderId;

    /** 商品id . */
    private String productId;

    /** 商品名称 . */
    private String productName;

    /** 商品价格 . */
    private BigDecimal productPrice;

    /** 商品数量 . */
    private Integer productQuantity;

    /** 商品小图 . */
    private String productIcon;

}
