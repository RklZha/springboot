package com.rkl.test.pojo;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
* ProductType 实体类
*
* @Project: springboot08-mybatis-plus
* @Author: 查建军
* @Date: 2019-05-05
* @Description:
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_product_type")
public class ProductType extends Model<ProductType> {
    private String name;
    private Integer status;
    @Override
    protected Serializable pkVal() {
        return null;
    }
}