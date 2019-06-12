package com.rkl.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-07 16:09
 * @Description:
 */
@Configuration
public class DataSourceConfig {
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource(){
		return  new BasicDataSource();
	}
}
