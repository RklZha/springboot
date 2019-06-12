package com.rkl.controller;

import com.rkl.bean.User;
import javafx.application.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-02 23:47
 * @Description:
 */
@Controller
public class TemplateController {
	//	@Autowired
	//	private User user;
	@RequestMapping("/success1")
	public String sucess1() {
		System.out.println("TemplateController--sucess1");
		return "success";//thymeleaf自动添加前缀和后缀
	}

	@RequestMapping("/success2")
	public ModelAndView sucess2() {
		System.out.println("TemplateController--sucess2");
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("name", "张三");
		return modelAndView;//thymeleaf自动添加前缀和后缀
	}

	@RequestMapping("/success3")
	public String sucess3(Model model) {
		System.out.println("TemplateController--sucess3");
		User user = new User(1,"zhangsan",18);
		List<String> strings = new ArrayList<>();
		strings.add("10");
		strings.add("11");
		strings.add("12");
		strings.add("13");
		model.addAttribute("username", "<h1>赵六</h1>");
		model.addAttribute("id", "myDiv");
		model.addAttribute("titile", "这是一个div");
		model.addAttribute("age", 12);
		model.addAttribute("lists", strings);
		model.addAttribute("user", user);
		return "success";//thymeleaf自动添加前缀和后缀
	}
	@RequestMapping("/modify")
	@ResponseBody
	public String modify(@ModelAttribute("user") User user){
		System.out.println("modify:"+user.toString());
		return "修改成功";
	}
	@RequestMapping("/test1")
	public String test1(Model model, HttpSession session){
		model.addAttribute("user",new User(1001,"tom",21));
		List<User> users = new ArrayList<>();
		users.add(new User(1002,"Jack",22));
		users.add(new User(1003,"lisi",23));
		users.add(new User(1004,"waang5",24));
		model.addAttribute("users",users);
		/*在内置对象session中存取*/
		session.setAttribute("sex","male");
		/*在内置对象application中存放数据*/
		session.getServletContext().setAttribute("hobby","写字");

		model.addAttribute("birthday",new Date());
		return "list";
	}
	@RequestMapping("/findUser")
	@ResponseBody
	public String findUser(String username){
		System.out.println("username="+username);
		return "sucess";
	}

}
