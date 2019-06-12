package com.rkl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：汤小洋
 * Date：2018-08-01 11:55
 * Description：<描述>
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/test1")
    public String test1(int num) {
        int i = 5 / num;
        return "success";
    }

    @RequestMapping("/test2")
    public String test2() {
        String str = null;
        str.toString();
        return "success";
    }

}
