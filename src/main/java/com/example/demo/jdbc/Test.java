package com.example.demo.jdbc;

public class Test {
    public static void main(String[] args){
        DbUtil.open();
        DbUtil db =  new DbUtil();
        db.toString();
    }
}
