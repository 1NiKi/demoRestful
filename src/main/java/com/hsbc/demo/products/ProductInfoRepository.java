package com.hsbc.demo.products;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @ClassName ProductInfoRepository
 * @Description:
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 13:07
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
