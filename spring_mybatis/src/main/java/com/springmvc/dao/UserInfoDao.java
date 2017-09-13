package com.springmvc.dao;

import java.util.List;

import com.springmvc.entity.UserInfo;  
  
public interface UserInfoDao {  
	
    int deleteByPrimaryKey(Integer id);  
  
    int insert(UserInfo record);  
  
    int insertSelective(UserInfo record);  
  
    UserInfo selectByPrimaryKey(Integer id);  
  
    int updateByPrimaryKeySelective(UserInfo record);  
  
    int updateByPrimaryKey(UserInfo record);  
      
    List<UserInfo> selectAll();  
}