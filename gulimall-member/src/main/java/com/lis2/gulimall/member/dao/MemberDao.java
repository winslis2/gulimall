package com.lis2.gulimall.member.dao;

import com.lis2.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lis2
 * @email rekunming@gmail.com
 * @date 2020-12-08 19:07:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
