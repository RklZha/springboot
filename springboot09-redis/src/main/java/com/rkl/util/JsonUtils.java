package com.rkl.util;

import com.alibaba.fastjson.JSON;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-08 19:53
 * @Description: Json工具类，基于fastjson
 */
public class JsonUtils {
	//private static JSONObject json = new JSONObject ();

	/**
	 * 将对象转换为json字符串
	 */
	public static String objectToJson(Object data) {

		String jsonString = JSON.toJSONString(data);
		return jsonString;
	}

	/**
	 * 将json字符串转换为对象
	 */
	public static <T> T jsonToObject(String jsonString, Class<T> clazz) {
		T t = JSON.parseObject(jsonString, clazz);
		return t;
	}
}
