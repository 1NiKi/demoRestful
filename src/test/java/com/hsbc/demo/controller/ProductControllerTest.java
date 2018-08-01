package com.hsbc.demo.controller;

import com.hsbc.demo.VO.ProductInfoVO;
import com.hsbc.demo.VO.ProductVO;
import com.hsbc.demo.VO.ResultVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName ProductControllerTest
 * @Description:
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 11:45
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductControllerTest {

    @Test
    public void list() {

      /*  ProductInfoVO productInfoVO = new ProductInfoVO();
        productInfoVO.setProductId("1");
        productInfoVO.setProductName("燕麦粥");
        productInfoVO.setProductDescription("nice");
        productInfoVO.setProductPrice(new BigDecimal(6.5));
        productInfoVO.setProductIcon("http://xxx.com");
        List<ProductInfoVO> productInfoVOList = new ArrayList<>();
        productInfoVOList.add(productInfoVO);

        ProductVO productVO = new ProductVO();
        productVO.setCategoryName("热销榜");
        productVO.setCategoryType(1);

        ResultVO<ProductVO> resultVO = new ResultVO<>();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(productVO);
*/
        Assert.assertEquals("1","1");

    }
}