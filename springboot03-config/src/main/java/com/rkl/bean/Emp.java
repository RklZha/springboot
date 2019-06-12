package com.rkl.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-03-31 13:06
 * @Description:
 */
@Component
public class Emp {
	@Value("${emp.id}")
	private int id;
	@Value("${emp.name}")
	private String name;
	@Value("${emp.createDate}")
	private Date createDate;
	//@Value()不支持复杂类型的封装
	private Dept dept;
	@Value("${emp.hobby}")
	private List<String> hobby;
	//@Value()不支持复杂类型的封装
	private Map<String,Object> map;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Emp{" + "id=" + id + ", name='" + name + '\'' + ", createDate=" + createDate + ", dept=" + dept
				+ ", hobby=" + hobby + ", map=" + map + '}';
	}
}
