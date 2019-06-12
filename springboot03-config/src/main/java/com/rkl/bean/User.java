package com.rkl.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-03-30 21:13
 * @Description:
 */
//必须将当前类添加到容器中
@Component
//加载外部属性文件
@PropertySource({"classpath:user.properties"})
//默认读取全局配置文件获取值，将当前类中的所有属性与配置文件中的user进行绑定
@ConfigurationProperties(prefix = "user")
public class User {
	private String username;
	private String age;
	private Boolean status;
	private Date birthday;
	private Address address;
	private List<String> lists;
	private Map<String, Object> maps;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	@Override
	public String toString() {
		return "User{" + "username='" + username + '\'' + ", age='" + age + '\'' + ", status=" + status + ", birthday="
				+ birthday + ", address=" + address + ", lists=" + lists + ", maps=" + maps + '}';
	}
}
