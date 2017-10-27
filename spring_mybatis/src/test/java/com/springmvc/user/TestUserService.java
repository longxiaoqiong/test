package com.springmvc.user;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.mysql.fabric.xmlrpc.base.Array;
import com.springmvc.entity.UserInfo;
import com.springmvc.service.UserService;  
  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-mybatis.xml" })  
public class TestUserService {  
  
    private static final Logger LOGGER = Logger  
            .getLogger(TestUserService.class);  
  
    @Autowired  
    private UserService userService;  
  
      
    @Test  
    public void testQueryById1() {  
        UserInfo userInfo = userService.getUserById(1);  
        LOGGER.info(JSON.toJSON(userInfo));  
    }  
  
    @Test  
    public void testQueryAll() {  
        List<UserInfo> userInfos = userService.getUsers();  
        LOGGER.info(JSON.toJSON(userInfos));  
    }  
  
    @Test  
    public void testInsert() {  
        UserInfo userInfo = new UserInfo();  
        userInfo.setUname("xiaoming3");  
        userInfo.setUnumber(20);  
        int result = userService.insert(userInfo);  
        System.out.println(result);  
    }
    
    @Test  
    public void getUserInfoList(){
    	UserInfo userInfo = new UserInfo();  
        userInfo.setUname("xiaoming");  
        userInfo.setUnumber(20);  
        
        UserInfo userInfo2 = new UserInfo();  
        userInfo2.setUname("xiaoming2");  
        userInfo2.setUnumber(20);  
        List<UserInfo> list=new ArrayList<UserInfo>();
        list.add(userInfo);
        list.add(userInfo2);
        List<UserInfo> users= userService.getUserInfoList(list); 
        System.out.println(users.size());  
        System.out.println(JSON.toJSON(users));
    }
}  