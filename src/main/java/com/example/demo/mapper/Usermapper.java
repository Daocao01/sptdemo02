package com.example.demo.mapper;


import com.example.demo.model.T_Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface Usermapper {
    @Select("select * from t_userinfo")
    public List<T_Userinfo> findAll();

}
