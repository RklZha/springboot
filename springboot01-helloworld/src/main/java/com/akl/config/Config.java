package com.akl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-05-27 15:43
 * @Description:
 */
@Configuration
public class Config {
	@Bean
	public TaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
		taskScheduler.setPoolSize(8);
		return taskScheduler;
	}

}
