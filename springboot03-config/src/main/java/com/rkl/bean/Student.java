package com.rkl.bean;

import java.util.List;
import java.util.Map;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-02 19:25
 * @Description:
 */
public class Student {
	private int id;
	private String name;
	private Banji banji;
	private List<String> lists;
	private Map<String,Object> map;

	public Student() {
	}

	public Student(int id, String name, Banji banji, List<String> lists, Map<String, Object> map) {
		this.id = id;
		this.name = name;
		this.banji = banji;
		this.lists = lists;
		this.map = map;
	}

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

	public Banji getBanji() {
		return banji;
	}

	public void setBanji(Banji banji) {
		this.banji = banji;
	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", banji=" + banji + ", lists=" + lists + ", map="
				+ map + '}';
	}
}
