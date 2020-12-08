package com.lis2.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lis2.common.utils.PageUtils;
import com.lis2.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author lis2
 * @email rekunming@gmail.com
 * @date 2020-12-08 11:22:33
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

