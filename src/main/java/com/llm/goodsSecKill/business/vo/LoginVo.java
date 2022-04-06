package com.llm.goodsSecKill.business.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * @description: 登录信息vo
 * @author: LiuLuMing
 * @createtime: 2022-04-01 11:09
 */
@Data
public class LoginVo {

    @NotBlank(message = "手机号不能为空")
    @Length(min = 11,message = "手机号长度不能小于11位")
    private String mobile;

    @NotBlank(message = "密码不能为空")
    @Length(min = 6,message = "密码长度不能小于6位")
    private String password;
}
