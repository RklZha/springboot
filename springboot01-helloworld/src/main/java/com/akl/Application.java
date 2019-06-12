package com.akl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-03-30 13:42
 * @Description: 使用@SpringBootApplication标识主程序类，表示这是一个SpringBoot应用
 */
@EnableScheduling
@EnableAsync
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//启动SpringBoot应用
		//传入主程序类的Class对象
		SpringApplication.run(Application.class, args);

	}
}
