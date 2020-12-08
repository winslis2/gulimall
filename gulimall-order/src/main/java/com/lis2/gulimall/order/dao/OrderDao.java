package com.lis2.gulimall.order.dao;

import com.lis2.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lis2
 * @email rekunming@gmail.com
 * @date 2020-12-08 19:13:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
