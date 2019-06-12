package com.akl.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-03-30 13:33
 * @Description:
 */
@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello world";
	}

}
