package com.tyust.friend.core.service;

import com.tyust.friend.core.entity.User;

public interface LoginService {

   User getUserById(String id);

    User login(String name, String password);
}
