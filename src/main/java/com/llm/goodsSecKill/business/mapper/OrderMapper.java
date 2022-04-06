package com.llm.goodsSecKill.business.mapper;

import com.llm.goodsSecKill.business.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author LiuLuMing
 * @since 2022-03-31
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
