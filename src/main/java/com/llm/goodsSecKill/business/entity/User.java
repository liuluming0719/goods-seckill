package com.llm.goodsSecKill.business.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author LiuLuMing
 * @since 2022-03-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID,手机号码
     */
    //@NotBlank(message = "手机号不能为空")
    private Long id;

    private String nickname;

    @NotBlank(message = "电话号码不能为空")
    private String phone;

    /**
     * MD5(MD5(pass明文+固定salt)+salt)
     */
    @NotBlank(message = "密码不能为空")
    private String password;

    private String salt;

    /**
     * 头像
     */
    private String head;

    /**
     * 注册时间
     */
    private LocalDateTime registerDate;

    /**
     * 最后一次登录时间
     */
    private LocalDateTime lastLoginDate;

    /**
     * 登录次数
     */
    private Integer loginCount;


}
