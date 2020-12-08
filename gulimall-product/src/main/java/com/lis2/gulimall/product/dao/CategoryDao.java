package com.lis2.gulimall.product.dao;

import com.lis2.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lis2
 * @email rekunming@gmail.com
 * @date 2020-12-08 11:22:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
