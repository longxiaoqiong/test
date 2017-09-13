package com.springmvc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserInfoDao;
import com.springmvc.entity.UserInfo;
import com.springmvc.service.UserService;  
  
@Service("userService")  
public class UserServiceImpl implements UserService {  
  
    @Autowired  
    private UserInfoDao userInfoDao;  
  
    public UserInfo getUserById(int id) {  
        return userInfoDao.selectByPrimaryKey(id);  
    }  
  
    public List<UserInfo> getUsers() {  
        return userInfoDao.selectAll();  
    }  
  
    public int insert(UserInfo userInfo) {  
          
        int result = userInfoDao.insert(userInfo);  
          
        System.out.println(result);  
        return result;  
    }  
  
}  