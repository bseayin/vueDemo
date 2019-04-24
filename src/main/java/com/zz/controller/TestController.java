package com.zz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class TestController {

    @GetMapping("t1")
    public Map test1(){
        Map map=new HashMap();
        map.put("key","来自星星的我");
        return map;
    }
    @PostMapping("t2")
    public Map test2(@RequestParam("uname") String name,@RequestParam("upwd") String pwd){
        System.out.println("用户名："+name);
        System.out.println("密码："+pwd);
        Map map=new HashMap();
        map.put("key","来自星星的我");
        return map;
    }
}
