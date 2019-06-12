package com.rkl.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

import javax.sql.DataSource;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-06-11 17:41
 * @Description:
 */
@Configuration
@MapperScan("com.rkl.dao")
public class MybatisConfig {
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return new DruidDataSource();
	}

	/**
	 * 分页插件
	 * @return
	 */
	@Bean
	public PaginationInterceptor page() {
		return new PaginationInterceptor();
	}

	// 配置事物管理器
	@Bean(name = "transactionManager")
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	/*public FreeMarkerConfigurationFactoryBean freemarker() {
		FreeMarkerConfigurationFactoryBean bean = new FreeMarkerConfigurationFactoryBean();
		bean.setTemplateLoaderPath("/WEB-INF");
		Properties properties = new Properties();
		properties.setProperty("defaultEncoding", "utf-8");
		bean.setFreemarkerSettings(properties);
		return bean;
	}*/

}