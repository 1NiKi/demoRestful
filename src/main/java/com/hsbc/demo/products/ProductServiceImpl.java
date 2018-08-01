package com.hsbc.demo.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


/**
 * @ClassName ProductServiceImpl
 * @Description: 商品详情
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 11:53
 **/
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductInfoRepository repository;

    /***
     * 查找一个商品
     * @param productId
     * @return
     */
    @Override
    public ProductInfo findOne(String productId) {
        return repository.getOne(productId);
    }

    /***
     * 查找所有商品
     * @param pageable
     * @return
     */
    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return null;
    }

    /***
     * 保存商品
     * @param productInfo
     * @return
     */
    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    /***
     * 删除商品
     * @param productId
     */
    @Override
    public void decrease(String  productId) {

    }

    /***
     * 增加商品
     * @param productInfo
     */
    @Override
    public void increase(ProductInfo productInfo) {

    }
}
