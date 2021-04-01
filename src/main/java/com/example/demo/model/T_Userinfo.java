package com.example.demo.model;

public class T_Userinfo {
    private Integer ID;
    private String UserName;
    private String Password;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "T_Userinfo{" +
                "ID=" + ID +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
