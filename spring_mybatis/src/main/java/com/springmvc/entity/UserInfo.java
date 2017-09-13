package com.springmvc.entity;

import java.io.Serializable;

public class UserInfo implements Serializable {  
	
	private static final long serialVersionUID = 1L;

	private Integer id;  
  
    private String uname;  
  
    private Integer unumber;  
  
    public Integer getId() {  
        return id;  
    }  
  
    public void setId(Integer id) {  
        this.id = id;  
    }  
  
    public String getUname() {  
        return uname;  
    }  
  
    public void setUname(String uname) {  
        this.uname = uname == null ? null : uname.trim();  
    }  
  
    public Integer getUnumber() {  
        return unumber;  
    }  
  
    public void setUnumber(Integer unumber) {  
        this.unumber = unumber;  
    }  
}  