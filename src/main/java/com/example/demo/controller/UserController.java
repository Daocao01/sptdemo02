package com.example.demo.controller;

import com.example.demo.mapper.Usermapper;
import com.example.demo.model.T_Userinfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
     @Resource
     private Usermapper usermapper;

    @RequestMapping(value = "/findUser",method = {RequestMethod.GET})
    @ResponseBody
     public List<T_Userinfo> findUser(){
        List<T_Userinfo> list = usermapper.findAll();
        System.out.println(list);
        return list;
     }
}
