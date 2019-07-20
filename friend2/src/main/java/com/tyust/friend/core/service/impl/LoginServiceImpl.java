package com.tyust.friend.core.service.impl;

import com.tyust.friend.core.dao.LoginDao;
import com.tyust.friend.core.entity.User;
import com.tyust.friend.core.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao loginDao;

    @Override
    public User getUserById(String id) {
        return loginDao.getUserById(id);
    }

    @Override
    public User login(String name, String password) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("username",name).andEqualTo("pass",password);
        List<User> list = loginDao.selectByExample(example);
        return list!=null?list.get(0):null;
    }
}
