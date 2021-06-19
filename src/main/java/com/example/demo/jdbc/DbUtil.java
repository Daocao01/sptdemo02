package com.example.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://db4free.net:3306/homelocal?serverTimezone=UTC";
        username = "mysqltest001";
        password = "87654321";

    }
    public static Connection open(){
        try {
            Class.forName(driver);
            return (Connection) DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            System.out.println("数据库链接失败");
            e.printStackTrace();
        }
        return null;
    }

    /** 增删改查**/


    public static void close(Connection conn){
        if(conn != null){
            try {
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
