package com.yu.springboottrya.controller;

import com.yu.springboottrya.domain.User;
import com.yu.springboottrya.service.FirstTryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yuL")
public class FirstTryController {

    @Autowired
    private FirstTryService firstTryService;

    @RequestMapping("tryA")
    public Object helloSpringBoot() {
        return firstTryService.getUserStr();
    }

    @RequestMapping("user")
    public User getUserTrans() {
        return firstTryService.getUser();
    }

}
