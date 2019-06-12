package com.rkl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-03-30 20:02
 * @Description:
 */
//@Controller
@RestController   //等同于@Controller+@ResponseBody
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
