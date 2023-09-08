package com.yuhan.snginx.repo.mysql.mapper;

import com.yuhan.snginx.modle.User;

import java.util.List;

/**
 * @author yuzhuJiao
 * @since 2023/08/27
 */
public interface UserMapper {

    List<User> getAllUsers();
}
