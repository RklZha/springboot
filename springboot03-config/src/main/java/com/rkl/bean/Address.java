package com.rkl.bean;

import org.springframework.beans.factory.annotation.Value;

import java.util.Objects;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-03-30 21:14
 * @Description:
 */
public class Address {
	private String province;
	private String city;

	public Address() {
	}

	public Address(String province, String city) {
		this.province = province;
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address{" + "province='" + province + '\'' + ", city='" + city + '\'' + '}';
	}
}
