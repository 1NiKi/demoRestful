package com.hsbc.demo.controller;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName GreetingController
 * @Description
 * @Author Niki
 * @Date 2018/7/30 10:58
 * @Version 1.0
 **/
@RestController
public class GreetingController {

 /*   @GetMapping("/greeting")
    public Greeting greetings(){
        return new Greeting(2,"Mike");
    }*/

    @GetMapping("/put")
    public String getRequest(){
        return "This is a get mapping!";
    }

    @PutMapping("/put")
    public String putRequest(){
        return "This is a put mapping!";
    }

    @DeleteMapping("/delete")
    public String deleteRequest(){
        return "This is a delete mapping!";
    }

    @PostMapping("/post")
    public String postRequest(){
        return "This is a post mapping!";
    }

}

