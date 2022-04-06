package com.llm.goodsSecKill.business.controller;


import com.llm.goodsSecKill.business.entity.User;
import com.llm.goodsSecKill.business.service.UserService;
import com.llm.goodsSecKill.common.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author LiuLuMing
 * @since 2022-03-31
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResultVo save(@Validated @RequestBody User user) {
        return ResultVo.success(userService.save(user));
    }

}
