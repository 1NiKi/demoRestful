package com.hsbc.demo.products;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @ClassName ProductInfo
 * @Description: 商品详情
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 10:34
 **/
@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class ProductInfo {

    @Id
    private String productId;

    /** 名称. */
    private String productName;

    /** 价格. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态 ,0正常1下架. */
    private Integer productStatus;

    /** 类目. */
    private Integer categoryType;

}

