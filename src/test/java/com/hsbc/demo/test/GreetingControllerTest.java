package com.hsbc.demo.test;

import com.hsbc.demo.entity.Greeting;
import org.junit.Test;

/**
 * @ClassName GreetingControllerTest
 * @Description: GreetingController测试类
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/7/30 11:21
 **/
public class GreetingControllerTest {

    @Test
    public void greetings() {
        Greeting greeting = new Greeting(1,"Mike");
        System.out.println("打印的内容是：" +greeting);
    }

}