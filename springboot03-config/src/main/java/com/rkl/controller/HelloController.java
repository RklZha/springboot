package com.rkl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-03-30 20:50
 * @Description:
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Springboot";
	}

}
