package com.hsbc.demo.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @Description: 商品（包含类目）
 * @Author: Niki
 * @Date: 2018/7/31 16:56
 */
@RequiredArgsConstructor
@Getter
@Setter
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
