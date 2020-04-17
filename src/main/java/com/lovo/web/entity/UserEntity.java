package com.lovo.web.entity;

//用户
public class UserEntity {
//    用户ID
    private String userId;
//    用户名字
    private String userName;
//    用户密码
    private String password;

    public UserEntity() {
    }

    public UserEntity(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
