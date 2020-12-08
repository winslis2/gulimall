package com.lis2.gulimall.coupon.dao;

import com.lis2.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lis2
 * @email rekunming@gmail.com
 * @date 2020-12-08 18:36:03
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
