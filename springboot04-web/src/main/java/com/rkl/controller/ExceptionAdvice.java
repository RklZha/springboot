package com.rkl.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-06 18:18
 * @Description: 异常通知，处理全局异常
 */
@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(ArithmeticException.class)
	public String arithmetic(Exception e){
		System.out.println("警报，程序出现异常，发短信："+e.getMessage());
		return "error/5xx";
	}

	@ExceptionHandler(Exception.class)
	public String exception(Exception e){
		System.out.println("警报，程序出现异常，发邮件："+e.getMessage());
		return "error/5xx";
	}

}
