package com.yuhan.snginx.repo.mysql;

import com.yuhan.snginx.modle.User;
import com.yuhan.snginx.repo.mysql.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yuzhuJiao
 * @since 2023/08/27
 */
@Repository
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.getAllUsers();
    }
}
