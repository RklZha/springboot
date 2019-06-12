package com.rkl.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.rkl.filter.MyFilter;
import com.rkl.listen.MyListen;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-16 18:47
 * @Description:
 */
@Configuration
@MapperScan("com.rkl.dao*")
public class MybatisConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return new DruidDataSource();
	}


	@Bean
	public FilterRegistrationBean MyFilter() {
		FilterRegistrationBean<MyFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
		filterFilterRegistrationBean.setFilter(new MyFilter());
		filterFilterRegistrationBean.addUrlPatterns("/**");
		return filterFilterRegistrationBean;
	}

	@Bean
	public ServletListenerRegistrationBean MyListen() {
		ServletListenerRegistrationBean<MyListen> listen = new ServletListenerRegistrationBean<>();
		listen.setListener(new MyListen());
		return listen;
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

//	public FreeMarkerConfigurationFactoryBean freemarker() {
//		FreeMarkerConfigurationFactoryBean bean = new FreeMarkerConfigurationFactoryBean();
//		bean.setTemplateLoaderPath("/WEB-INF");
//		Properties properties = new Properties();
//		properties.setProperty("defaultEncoding", "utf-8");
//		bean.setFreemarkerSettings(properties);
//		return bean;
//	}


}
