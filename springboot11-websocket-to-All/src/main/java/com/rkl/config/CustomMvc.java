package com.rkl.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-06-11 17:39
 * @Description:
 */
@Configuration
public class CustomMvc implements WebMvcConfigurer {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/show").setViewName("views/index");
		registry.addViewController("/").setViewName("views/index");
	}
}
