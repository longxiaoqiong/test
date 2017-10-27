package com.springmvc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.springmvc.entity.UserInfo;  
  
public interface UserInfoDao {  
	
    int deleteByPrimaryKey(Integer id);  
  
    int insert(UserInfo record);  
  
    int insertSelective(UserInfo record);  
  
    UserInfo selectByPrimaryKey(Integer id);  
  
    int updateByPrimaryKeySelective(UserInfo record);  
  
    int updateByPrimaryKey(UserInfo record);  
      
    List<UserInfo> selectAll();  
    
    List<UserInfo> getUserInfoList(@Param("list")List<UserInfo> list);
}