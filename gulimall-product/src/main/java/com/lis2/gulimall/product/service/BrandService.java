package com.lis2.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lis2.common.utils.PageUtils;
import com.lis2.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lis2
 * @email rekunming@gmail.com
 * @date 2020-12-08 11:22:34
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

