package com.llm.goodsSecKill.business.service;

import com.llm.goodsSecKill.business.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.llm.goodsSecKill.business.vo.LoginVo;
import com.llm.goodsSecKill.common.vo.ResultVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
     * @param request request
     * @param response response
     * @return ResultVo
     * @author  LiuLuMing
     * @createtime  2022/4/1 11:34
     */
    ResultVo doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);

    /**
     * 功能说明: 通过cookie获取user
     *
     * @param ticket cookie
     * @param request request
     * @param response response
     * @return com.llm.goodsSecKill.business.entity.User
     * @author  LiuLuMing
     * @createtime  2022/4/7 16:43
     */
    User getUserByCookie(String ticket,HttpServletRequest request,HttpServletResponse response);
}
