package com.llm.goodsSecKill.business.controller;

import com.llm.goodsSecKill.business.service.UserService;
import com.llm.goodsSecKill.business.vo.LoginVo;
import com.llm.goodsSecKill.common.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;


/**
 * @description: 登录controller
 * @author: LiuLuMing
 * @createtime: 2022-04-01 10:20
 */
@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @Autowired
    UserService userService;

    /**
     * 功能说明: 跳转登录页面
     *
     * @return 登录页面
     * @author LiuLuMing
     * @createtime 2022/4/1 10:22
     */
    @RequestMapping("toLogin")
    public String toLogin() {
        return "login";
    }

    /**
     * 功能说明: 登录验证
     *
     * @param loginVo 登录参数信息
     * @return ResultVo
     * @author  LiuLuMing
     * @createtime  2022/4/1 11:34
     */
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public ResultVo doLogin(@Valid @RequestBody LoginVo loginVo) {
        log.info("{}", loginVo);
        return userService.doLogin(loginVo);
    }
}
