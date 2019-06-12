package com.rkl.bean;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-02 19:28
 * @Description:
 */
public class Banji {
	private int banjiId;
	private String banjiName;

	public Banji() {
	}

	public Banji(int banjiId, String banjiName) {
		this.banjiId = banjiId;
		this.banjiName = banjiName;
	}

	public int getBanjiId() {
		return banjiId;
	}

	public void setBanjiId(int banjiId) {
		this.banjiId = banjiId;
	}

	public String getBanjiName() {
		return banjiName;
	}

	public void setBanjiName(String banjiName) {
		this.banjiName = banjiName;
	}

	@Override
	public String toString() {
		return "Banji{" + "banjiId=" + banjiId + ", banjiName='" + banjiName + '\'' + '}';
	}
}
