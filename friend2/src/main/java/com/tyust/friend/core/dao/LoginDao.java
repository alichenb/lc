package com.tyust.friend.core.dao;

import com.tyust.friend.core.base.BaseDao;
import com.tyust.friend.core.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao extends BaseDao<User> {

    User getUserById(String id);
}
