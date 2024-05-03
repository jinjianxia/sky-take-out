package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * ClassName: UserMapper
 * Description:
 *
 * @Author jinjianxia
 * @Create 2024/4/28 10:50
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    void insert(User user);
@Select("select * from user where id = #{userId}")
    User getById(Long userId);

    Integer countByMap(Map map);
}
