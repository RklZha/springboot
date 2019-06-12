package com.rkl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-07 14:46
 * @Description:
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		System.out.println("HelloController.hello");
		model.addAttribute("name", "alice");
		return "success";
	}
}
