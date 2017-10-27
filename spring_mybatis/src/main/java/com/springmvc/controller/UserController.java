package com.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.entity.UserInfo;
import com.springmvc.service.UserService;  
  

@Controller  
@RequestMapping("/user")  
public class UserController {  
  
    @Autowired 
    private UserService userService;  
      
    @RequestMapping("/showInfo/{userId}")  
    public String showUserInfo(ModelMap modelMap, @PathVariable int userId){  
        UserInfo userInfo = userService.getUserById(userId);  
        modelMap.addAttribute("userInfo", userInfo);  
        return "/user/showInfo";  
    }  
      
    @RequestMapping("/showInfos")  
    public @ResponseBody Object showUserInfos(){  
        List<UserInfo> userInfos = userService.getUsers();  
        return userInfos;  
    }
    
    
    public static void main(String[] args) throws InterruptedException {
		String s[]={"1","2","3","4","5","6","7","8","9"};
		String s1[]={"4","6","9"};
		List<String> list=new ArrayList<String>();
		list.add("UK");
		list.add("EN");
		list.add("CN");
		list.add("JP");
		List<String> list2=new ArrayList<String>();
		list2.add("UK");
		list2.add("CN");
		list2.add("EN");
		
		System.out.println(list.containsAll(list2));
		
		
		
		System.out.println(new Date().getTime());
			
	}
}  