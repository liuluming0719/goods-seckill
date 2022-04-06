package com.llm.goodsSecKill.business.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.llm.goodsSecKill.business.entity.User;
import com.llm.goodsSecKill.business.mapper.UserMapper;
import com.llm.goodsSecKill.business.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.llm.goodsSecKill.business.vo.LoginVo;
import com.llm.goodsSecKill.common.enums.ResultEnum;
import com.llm.goodsSecKill.common.utils.MD5Util;
import com.llm.goodsSecKill.common.utils.RandomUtil;
import com.llm.goodsSecKill.common.vo.ResultVo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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


    @Override
    public boolean save(User user) {
        user.setSalt(RandomUtil.generateRandom(8));
        String password = MD5Util.encryption(user.getPassword(), user.getSalt());
        user.setPassword(password);
        user.setRegisterDate(LocalDateTime.now());
        return this.getBaseMapper().insert(user) > 0 ? true : false;
    }


    @Override
    public ResultVo doLogin(LoginVo loginVo) {
        User user = this.getBaseMapper().selectOne((new QueryWrapper<User>().lambda().eq(User::getPhone,loginVo.getMobile())));
        if (user == null) {
            return ResultVo.error(ResultEnum.LOGIN_USER_ERROR);
        } else {
            String encryption = MD5Util.secondEncryption(loginVo.getPassword(), user.getSalt());
            if (!encryption.equals(user.getPassword())) {
                return ResultVo.error(ResultEnum.LOGIN_PASSWORD_ERROR);
            }
        }
        return ResultVo.success();
    }
}
