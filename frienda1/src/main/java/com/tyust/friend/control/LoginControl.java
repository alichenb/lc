package com.tyust.friend.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/LoginControl")
public class LoginControl {

    @Autowired
    HttpSession session;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public int  login(){
        return 1;
    }
}
