package com.lis2.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.lis2.gulimall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lis2.gulimall.member.entity.MemberEntity;
import com.lis2.gulimall.member.service.MemberService;
import com.lis2.common.utils.PageUtils;
import com.lis2.common.utils.R;



/**
 * 会员
 *
 * @author lis2
 * @email rekunming@gmail.com
 * @date 2020-12-08 19:07:22
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeignService couponFeignService ;

    @RequestMapping("/coupon")
    public R test() {
        MemberEntity memberEntity = new MemberEntity ();
        memberEntity.setNickname ("李四");
        R r = couponFeignService.memberCoupons ();
        return R.ok ().put ("memeber", memberEntity).put ("coupon",r.get("coupon"));

    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
