package com.hsbc.demo.orders;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @ClassName OrderService
 * @Description:
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 16:54
 **/
public interface OrderService {

    /***
     * 查询订单列表
     * @param buyerOpenId
     * @param pageable
     * @return
     */
    Page<OrderDetail> findList(String buyerOpenId, Pageable pageable);

}
