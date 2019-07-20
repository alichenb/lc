package com.tyust.friend.core.control;

import com.tyust.friend.core.entity.User;
import com.tyust.friend.core.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/LoginControl")
public class LoginControl {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }

    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public User getUserById(){
        return loginService.getUserById("1");
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody User login(@RequestBody Map<String,String> map){
        String password = map.get("password");
        String name = map.get("name");
        User user = loginService.login(name,password);
        if(user!=null){
            return user;
        }
        return null;
    }
}
