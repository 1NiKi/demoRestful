package com.hsbc.demo.products;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * @ClassName ProductService
 * @Description:
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 13:07
 **/
public interface ProductService {

    /***
     * 查找一个商品
     * @param productId
     * @return
     */
    ProductInfo findOne(String productId);

    /***
     * 查找所有商品
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /***
     * 保存商品
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /***
     * 增加商品
     * @param productId
     */
    void decrease(String productId);

    /***
     * 减少商品
     * @param productInfo
     */
    void increase(ProductInfo productInfo);
}
