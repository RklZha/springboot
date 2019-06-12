package com.rkl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-07 22:04
 * @Description: lombok的使用
 *  lombok提供了许多注解，标注在类上或属性上
 *  常用注解：@Getter、@Setter、@ToString、@EqualsAndHashCode
 */
// @Getter
// @Setter
// @EqualsAndHashCode
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private Integer id;
	private String username;
	private String password;


}
