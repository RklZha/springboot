package com.rkl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-06-11 18:03
 * @Description:
 */
@Controller
public class MvcController {
	@RequestMapping("/welcome")
	public String mvc(Model model){
		model.addAttribute("welcome","themeleaf welcome");
		return "views/welcome";
	}

	@Controller
	public class ViewController {

		@GetMapping("/nasus")
		public String getView(){
			return "websocket/nasus";
		}
	}
}
