package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.core.annotation.Order;

/**
 * ClassName: OrderMapper
 * Description:
 *
 * @Author jinjianxia
 * @Create 2024/5/2 09:45
 * @Version 1.0
 */
@Mapper
public interface OrderMapper {
    void insert(Orders order);
}
