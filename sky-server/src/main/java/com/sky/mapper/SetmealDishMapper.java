package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SetMealDishMapper
 * Description:
 *
 * @Author jinjianxia
 * @Create 2024/4/27 09:01
 * @Version 1.0
 */
@Mapper
public interface SetmealDishMapper {
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
