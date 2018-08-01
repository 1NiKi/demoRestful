package com.hsbc.demo.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @ClassName ProductInfoVO
 * @Description:  传给前端的商品信息视图对象 （下单的时候传到前端的商品信息）
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/7/31 16:46
 **/
@RequiredArgsConstructor
@Getter
@Setter
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;

}
