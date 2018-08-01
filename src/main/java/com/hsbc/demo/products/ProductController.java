package com.hsbc.demo.products;

import com.hsbc.demo.VO.ProductInfoVO;
import com.hsbc.demo.VO.ProductVO;
import com.hsbc.demo.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProductController
 * @Description:
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 10:37
 **/
@RestController
@RequestMapping("/order/product")
public class ProductController {

    @GetMapping("/list")
    public ResultVO list(){
        ProductInfoVO productInfoVO = new ProductInfoVO();
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

        return resultVO;

    }
}
