package com.rkl.listen;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-16 19:23
 * @Description:
 */
public class MyListen implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("MyListen.contextInitialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("MyListen.contextDestroyed");
	}
}
