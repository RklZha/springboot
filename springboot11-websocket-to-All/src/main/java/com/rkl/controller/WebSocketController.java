package com.rkl.controller;

import com.rkl.entity.AricMessage;
import com.rkl.entity.AricResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-06-11 19:04
 * @Description:
 */
@RestController
public class WebSocketController {

	@MessageMapping("/hello") // @MessageMapping 和 @RequestMapping 功能类似，浏览器向服务器发起消息，映射到该地址。
	@SendTo("/nasus/getResponse") // 如果服务器接受到了消息，就会对订阅了 @SendTo 括号中的地址的浏览器发送消息。
	public AricResponse say(AricMessage message) throws Exception {
		Thread.sleep(3000);
		return new AricResponse("Hello," + message.getName() + "!");
	}
}

