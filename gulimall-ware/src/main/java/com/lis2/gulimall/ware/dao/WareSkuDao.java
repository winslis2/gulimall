package com.lis2.gulimall.ware.dao;

import com.lis2.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lis2
 * @email rekunming@gmail.com
 * @date 2020-12-08 19:23:27
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
