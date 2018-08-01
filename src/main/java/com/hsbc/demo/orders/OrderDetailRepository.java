package com.hsbc.demo.orders;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName OrderDetailRepository
 * @Description: 订单详情仓库
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/8/1 16:41
 **/
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String>{

    List<OrderDetail> findByOrderId(String orderId);

}
