package com.experiment.mapper;

import com.experiment.pojo.User;

public interface UserMapper {
    User findUserByEmailAndPassword(User user);
    //用户注册
    int addOne(User user);
    //注册时的重名检测
    User checkReg(String username);
}
