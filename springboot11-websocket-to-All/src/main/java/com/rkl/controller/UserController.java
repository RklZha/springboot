package com.rkl.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.rkl.dao.UserDao;
import com.rkl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-05-13 15:46
 * @Description:
 */
@RestController
public class UserController {
	@Autowired
	private UserDao userDao;

	@GetMapping("/findAll")
	public Page<User> findAll(int pageNum, int pageSize) {
		Page<User> page = new Page<>();
		return page;
	}

	@GetMapping("/findByCondition")
	public List<User> findByCondition(String id) {
		Wrapper<User> wrapper = new EntityWrapper<User>();
		wrapper.gt("id", id);
		return userDao.selectList(new EntityWrapper<User>());
	}

}