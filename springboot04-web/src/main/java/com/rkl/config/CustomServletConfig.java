package com.rkl.config;

import com.rkl.filter.MyFilter;
import com.rkl.listen.MyListen;
import com.rkl.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-06 18:23
 * @Description: 自定义Servlet配置
 */
@Configuration
public class CustomServletConfig {
	//注册Servlet
	@Bean
	public ServletRegistrationBean myServlet(){
		ServletRegistrationBean<MyServlet> RegistrationBean = new ServletRegistrationBean<>();
		RegistrationBean.setServlet(new MyServlet());
		RegistrationBean.addUrlMappings("/myServlet");
		return RegistrationBean;
	}

	@Bean
	public FilterRegistrationBean myFilter(){
		FilterRegistrationBean<MyFilter> myFilterFilterRegistrationBean = new FilterRegistrationBean<>();
		myFilterFilterRegistrationBean.setFilter(new MyFilter());
		myFilterFilterRegistrationBean.addUrlPatterns("/showLogin","/success3");
		return myFilterFilterRegistrationBean;
	}
	@Bean
	public ServletListenerRegistrationBean myListen(){
		ServletListenerRegistrationBean<MyListen> myListenServletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
		myListenServletListenerRegistrationBean.setListener(new MyListen());
		return myListenServletListenerRegistrationBean;
	}
}
