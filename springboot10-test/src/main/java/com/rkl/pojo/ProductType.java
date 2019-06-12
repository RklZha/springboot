package com.rkl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
@ToString
public class ProductType implements Serializable{

    private Integer id;
    private String name;
    private Integer status;
}
