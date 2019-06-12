package com.rkl.controller;

import com.github.pagehelper.PageInfo;
import com.rkl.pojo.User;
import com.rkl.service.UserService;
import com.rkl.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-07 17:53
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}

	@RequestMapping("/findById")
	public User findById(int id){
		return userService.findById(id);
	}

	@RequestMapping("/insert")
	public User insert(User user){
		userService.insert(user);
		return user;
	}
	@RequestMapping("/delete")
	public int delete(int id){
		return userService.delete(id);
	}
	@RequestMapping("/findPage")
	public PageInfo<User> findPage(int pageNum){
		return userService.findByPage(pageNum,3);
	}
}
