package com.experiment.service;

import com.experiment.pojo.User;

public interface UserService {
    public User findUser(User user);
    public int addOne(User user) ;
    public User checkReg(String email) ;

}
