package com.rkl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-07 16:42
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
	private Integer id;
	private String username;
	private String password;

}
