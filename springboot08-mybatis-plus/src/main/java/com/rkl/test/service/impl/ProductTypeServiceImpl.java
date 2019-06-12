package com.rkl.test.service.impl;

import com.rkl.test.pojo.ProductType;
import com.rkl.test.mapper.ProductTypeMapper;
import com.rkl.test.service.IProductTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
*
* ProductType 服务实现类
*
* @Project: springboot08-mybatis-plus
* @Author: 查建军
* @Date: 2019-05-05
* @Description:
*/

@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

}
