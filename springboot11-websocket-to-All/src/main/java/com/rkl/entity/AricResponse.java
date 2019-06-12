package com.rkl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-06-11 18:53
 * @Description: 服务端向浏览器发送的消息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AricResponse {
	private String responseMessage;
}
