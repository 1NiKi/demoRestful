package com.hsbc.demo.products;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


/**
 * @ClassName ProductServiceImplTest
 * @Description:
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 13:40
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123");
        Assert.assertEquals("123",productInfo.getProductId());
    }

    @Test
    public void findAll() {
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("西瓜汁");
        productInfo.setProductDescription("非常解渴的");
        productInfo.setProductPrice(new BigDecimal(8.5));
        productInfo.setCategoryType(1);
        productInfo.setProductIcon("http://xxx.com");
        productInfo.setProductStock(300);
        productInfo.setProductStatus(0);

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void decrease() {
    }

    @Test
    public void increase() {
    }
}