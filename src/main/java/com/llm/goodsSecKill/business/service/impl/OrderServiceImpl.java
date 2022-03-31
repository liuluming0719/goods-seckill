package com.llm.goodsSecKill.business.service.impl;

import com.llm.goodsSecKill.business.entity.Order;
import com.llm.goodsSecKill.business.mapper.OrderMapper;
import com.llm.goodsSecKill.business.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author LiuLuMing
 * @since 2022-03-31
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
