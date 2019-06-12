package com.rkl.bean;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-03-31 13:08
 * @Description:
 */
public class Dept {
	private String deptId;
	private String deptName;

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Dept{" + "deptId='" + deptId + '\'' + ", deptName='" + deptName + '\'' + '}';
	}
}
