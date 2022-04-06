package com.llm.goodsSecKill.business.service;

import com.llm.goodsSecKill.business.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.llm.goodsSecKill.business.vo.LoginVo;
import com.llm.goodsSecKill.common.vo.ResultVo;


/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author LiuLuMing
 * @since 2022-03-31
 */
public interface UserService extends IService<User> {

    /**
     * 功能说明: 登录验证
     *
     * @param loginVo 登录参数信息
     * @return ResultVo
     * @author  LiuLuMing
     * @createtime  2022/4/1 11:34
     */
    ResultVo doLogin(LoginVo loginVo);
}
