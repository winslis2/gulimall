package com.lis2.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lis2.common.utils.PageUtils;
import com.lis2.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author lis2
 * @email rekunming@gmail.com
 * @date 2020-12-08 11:22:33
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

