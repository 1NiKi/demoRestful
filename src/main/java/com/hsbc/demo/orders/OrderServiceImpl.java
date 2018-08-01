package com.hsbc.demo.orders;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @ClassName OrderServiceImpl
 * @Description:
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 16:57
 **/
public class OrderServiceImpl implements OrderService {
    @Override
    public Page<OrderDetail> findList(String buyerOpenId, Pageable pageable) {
        return null;
    }
}
