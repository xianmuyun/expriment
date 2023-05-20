package com.experiment.service;

import com.experiment.mapper.UserMapper;
import com.experiment.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUser(User user) {
        return userMapper.findUserByEmailAndPassword(user);
    }
    @Override
    public int addOne(User user) {

        return userMapper.addOne(user);
    }
    @Override
    public User checkReg(String email) {

        return userMapper.checkReg(email);
    }

}
