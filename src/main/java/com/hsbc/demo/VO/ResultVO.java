package com.hsbc.demo.VO;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @Description: http请求返回最外层对象  VO ----> view object
 * @Author: Niki
 * @Date: 2018/7/31 16:50
 */
@RequiredArgsConstructor
@Getter
@Setter    //@RequiredArgsConstructor、@Getter、@Setter 这三个相当于视频中的@Data;如果我要写的@Data的话，就还要手动在当前类加一个无参的构造方法
public class ResultVO<T> {

    /** 错误码 .*/
    private Integer code;

    /** 提示信息 .*/
    private String msg;

    /** 具体内容 .*/
    private T data;
}
