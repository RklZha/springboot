package com.rkl.config;

import com.rkl.interceptor.Myinterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-06 17:31
 * @Description: 要求：
 *   1.使用@Configuration标注为配置类
 *   2.实现WebMvcConfigurer接口
 *   3.根据需要实现相应的方法
 *   注：这个接口中的方法都添加了Jdk1.8中的default方法修饰，不强制实现所有的方法（jdk1.8新特性）
 *   在SpringBoot1.0中是继承WebMvcConfigurerAdapter类，在SpringBoot2.0中已过时
 */
@Configuration
public class CustomMvcConfig implements WebMvcConfigurer {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/showLogin").setViewName("login");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new Myinterceptor()).addPathPatterns("/**").excludePathPatterns("/success3");
	}

}
