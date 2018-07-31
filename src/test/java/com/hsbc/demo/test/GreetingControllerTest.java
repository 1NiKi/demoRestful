package com.hsbc.demo.test;

import com.hsbc.demo.entity.Greeting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName GreetingControllerTest
 * @Description: GreetingController测试类
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/7/30 11:21
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerTest {

    @Test
    public void greetings() {
        Greeting greeting = new Greeting(1,"Mike");
        System.out.println("打印的内容是：" +greeting);
    }

    @Test
    public void getRequest() {
        Greeting greeting = new Greeting(2,"Jack");
        System.out.println("打印的内容是：" +greeting);
    }

    @Test
    public void putRequest() {
        Greeting greeting = new Greeting(3,"Jack");
        System.out.println("打印的内容是：" +greeting);
    }

    @Test
    public void deleteRequest() {
        Greeting greeting = new Greeting(2,"Jack");
        System.out.println("打印的内容是：" +greeting);
    }

    @Test
    public void postRequest() {
        Greeting greeting = new Greeting(4,"Lucy");
        System.out.println("打印的内容是：" +greeting);
    }
    

}