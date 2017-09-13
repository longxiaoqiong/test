package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.UserInfo;  
  
public interface UserService {  
  
    UserInfo getUserById(int id);  
      
    List<UserInfo> getUsers();  
      
    int insert(UserInfo userInfo);  
}  