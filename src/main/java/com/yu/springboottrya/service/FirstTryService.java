package com.yu.springboottrya.service;

import com.yu.springboottrya.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstTryService {

    @Autowired
    User user;

    public String getUserStr() {
        return "用户ID：" + user.getXCltNbr() + "\t\t用户姓名：" + user.getXCltNam();
    }

    public User getUser() {
        return user;
    }

}
