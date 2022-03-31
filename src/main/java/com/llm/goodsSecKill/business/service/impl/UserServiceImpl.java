package com.llm.goodsSecKill.business.service.impl;

import com.llm.goodsSecKill.business.entity.User;
import com.llm.goodsSecKill.business.mapper.UserMapper;
import com.llm.goodsSecKill.business.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author LiuLuMing
 * @since 2022-03-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
