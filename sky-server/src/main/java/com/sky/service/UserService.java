package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * ClassName: UserService
 * Description:
 *
 * @Author jinjianxia
 * @Create 2024/4/28 10:10
 * @Version 1.0
 */
public interface UserService {
    User wxLogin(UserLoginDTO userLoginDTO);
}
