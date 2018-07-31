package com.hsbc.demo.controller;

import com.hsbc.demo.entity.Food;
import com.hsbc.demo.entity.JsonModel;
import com.hsbc.demo.entity.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @ClassName GreetingControllerTest
 * @Description:
 * @Author: Niki
 * @Version 1.0
 * @Date:2018/7/31 17:53
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerTest {

    // 注入Spring 工厂
    @Autowired
    private WebApplicationContext context;
    //伪造mvc环境
    @Autowired
    private MockMvc mvc;

    private MockHttpSession session;

    @Before
    public void setupMockMvc() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();

    }

    @Test
    public void addTest() throws Exception {
        String result = "{\n" +
                "  \"code\": \"0\",\n" +
                "  \"message\": \"成功\",\n" +
                "  \"products\": {\n" +
                "    \"name\": \"热销榜\",\n" +
                "    \"type\": \"1\",\n" +
                "    \"foods\": {\n" +
                "      \"id\": \"1\",\n" +
                "      \"name\": \"木桶饭\",\n" +
                "      \"price\": 12.6,\n" +
                "      \"description\": \"有点咸\",\n" +
                "      \"icon\": \"http://XXX.com\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
        this.mvc.perform((RequestBuilder) post("/food/info/add"))
                .andExpect(status().isOk())
                .andExpect(content().json(result))
                .andDo(print());
    }

    @Test
    public void updateTest() throws Exception {
        String result = " \"code\": \"0\",\n" +
                "  \"message\": \"成功\",\n" +
                "  \"products\": {\n" +
                "    \"name\": \"家常榜\",\n" +
                "    \"type\": \"2\",\n" +
                "    \"foods\": {\n" +
                "      \"id\": \"1\",\n" +
                "      \"name\": \"西红柿炒蛋\",\n" +
                "      \"price\": 15.6,\n" +
                "      \"description\": \"味道刚刚好\",\n" +
                "      \"icon\": \"http://XX.com\"\n" +
                "    }";
        this.mvc.perform(put("/food/info/update"))
                .andExpect(status().isOk())
                .andExpect(content().json(result))
                .andDo(print());
    }

    @Test
    public void deleteTest() throws Exception {
        String result = "  \"code\": \"0\",\n" +
                "  \"message\": \"成功\",\n" +
                "  \"products\": {\n" +
                "    \"name\": \"家常榜\",\n" +
                "    \"type\": \"2\",\n" +
                "    \"foods\": {\n" +
                "      \"id\": \"3\",\n" +
                "      \"name\": \"皮蛋瘦肉粥\",\n" +
                "      \"price\": 15.6,\n" +
                "      \"description\": \"有点儿咸\",\n" +
                "      \"icon\": \"http://XX.com\"\n" +
                "    }\n" +
                "  }";
        this.mvc.perform(delete("/food/info/delete"))
                .andExpect(status().isOk())
                .andExpect(content().json(result))
                .andDo(print());
    }

    @Test
    public void queryTest() throws Exception {
        String result = " \"code\": \"0\",\n" +
                "  \"message\": \"成功\",\n" +
                "  \"products\": {\n" +
                "    \"name\": \"家常榜\",\n" +
                "    \"type\": \"2\",\n" +
                "    \"foods\": {\n" +
                "      \"id\": \"4\",\n" +
                "      \"name\": \"小米粥\",\n" +
                "      \"price\": 6.6,\n" +
                "      \"description\": \"味道挺好\",\n" +
                "      \"icon\": \"http://XX.com\"\n" +
                "    }\n" +
                "  }";
        this.mvc.perform(get("/food/info/query"))
                .andExpect(status().isOk())
                .andExpect(content().json(result))
                .andDo(print());
    }
}