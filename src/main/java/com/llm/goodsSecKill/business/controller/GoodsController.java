package com.llm.goodsSecKill.business.controller;


import com.llm.goodsSecKill.business.entity.User;
import com.llm.goodsSecKill.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author LiuLuMing
 * @since 2022-03-31
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    UserService userService;

    /**
     * 功能说明: 商品列表页面
     *
     * @param model model
     * @param user 用户对象
     * @return java.lang.String
     * @author  LiuLuMing
     * @createtime  2022/4/7 9:49
     */
    @RequestMapping("toGoodsList")
    public String toGoodsList(Model model, User user) {
        model.addAttribute("user",user);
        return "goodsList";
    }
}
