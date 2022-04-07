package com.llm.goodsSecKill.business.controller;


import com.llm.goodsSecKill.business.entity.User;
import com.llm.goodsSecKill.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
     * @param request request
     * @param response response
     * @param model model
     * @param ticket cookie
     * @return java.lang.String
     * @author  LiuLuMing
     * @createtime  2022/4/7 9:49
     */
    @RequestMapping("toGoodsList")
    public String toGoodsList(HttpServletRequest request, HttpServletResponse response, Model model, @CookieValue("userTicket") String ticket) {
        if (StringUtils.isEmpty(ticket)) {
            return "login";
        }
        //User user = (User) session.getAttribute(ticket);
        User user = userService.getUserByCookie(ticket, request, response);
        if (user == null) {
            return "login";
        }
        model.addAttribute("user",user);
        return "goodsList";
    }
}
