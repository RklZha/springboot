package com.rkl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-07 16:42
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sysuser implements Serializable {
    private Integer id;
    private String name;
    private String loginName;
    private String password;
    private String phone;
    private String email;
    private Integer isValid;
    private Date createDate;
    private Role role;

}
