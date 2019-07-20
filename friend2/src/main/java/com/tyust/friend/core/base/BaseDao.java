package com.tyust.friend.core.base;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.base.BaseUpdateMapper;
import tk.mybatis.mapper.common.base.delete.DeleteMapper;
import tk.mybatis.mapper.common.base.insert.InsertMapper;
import tk.mybatis.mapper.common.base.select.SelectByPrimaryKeyMapper;
import tk.mybatis.mapper.common.base.select.SelectMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

@Repository
public interface BaseDao<T> extends  InsertMapper<T> , BaseUpdateMapper<T>, SelectMapper<T>, DeleteMapper<T>, SelectByPrimaryKeyMapper<T>, SelectByExampleMapper<T> {

}
