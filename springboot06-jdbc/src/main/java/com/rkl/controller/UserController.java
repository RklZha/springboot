package com.rkl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-07 16:19
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/findAll")
	@ResponseBody
	public List<Map<String, Object>> findAll(){
		List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from t_user");
		return maps;
	}
}
