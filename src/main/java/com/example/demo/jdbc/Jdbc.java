package com.example.demo.jdbc;

import com.example.demo.model.T_Userinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {
    public static void main(String[] args){
        T_Userinfo us = new T_Userinfo();
        us.setID(2);
        us.setPassword("666");
        us.setUserName("Monkey");
        insert(us);
        us = query(8);
    }
    static void insert(T_Userinfo t){
        String sql = "insert into t_userinfo(ID,UserName,Password) value(?,?,?)";
        Connection conn  = DbUtil.open();
        try {
            PreparedStatement pstmt  = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1,t.getID());
            pstmt.setString(2,t.getUserName());
            pstmt.setString(3,t.getPassword());

            pstmt.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DbUtil.close(conn);
        }

    }
    static T_Userinfo query(int  id){
        String sql = "select * from t_userinfo where id=?";
        Connection conn = DbUtil.open();
        try {
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                String name = rs.getNString("UserName");
                Integer id2 = rs.getInt("id");
                T_Userinfo t = new T_Userinfo();
                t.setID(id);
                t.setUserName(name);
                return  t;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DbUtil.close(conn);
        }
        return null;
    }

}
