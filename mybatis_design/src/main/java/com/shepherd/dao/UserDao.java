package com.shepherd.dao;

import com.shepherd.domain.User;
import com.shepherd.mybatis.annotations.Select;

import java.util.List;

/**
 * @author fjZheng
 * @version 1.0
 * @date 2021/3/25 10:03
 */
public interface UserDao {

    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
