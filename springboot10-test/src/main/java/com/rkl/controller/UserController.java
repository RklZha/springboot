package com.rkl.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.rkl.pojo.User;
import com.rkl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-16 19:34
 * @Description:
 */
@Controller
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/findAll")
	public String findAll(Model model) {
		System.out.println("UserController.findAll");
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "users";
	}

	@RequestMapping("/findById")
	public String findById(int id, Model model) {

		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "user";
	}

	@RequestMapping("/insert")
	public String insert(User user, Model model) {
		userService.insert(user);
		model.addAttribute("user", user);
		return "user";
	}

	@RequestMapping("/delete")
	public String delete(int id, Model model) {
		int i = userService.delete(id);
		model.addAttribute("result", i);
		return "result";
	}

	@RequestMapping("/findPage")
	public String findPage(int pageNum, Model model) {
		Page<User> pageInfo = userService.findByPage(pageNum, 3);
		model.addAttribute("pageInfo", pageInfo);
		return "userPageInfo";
	}
}
