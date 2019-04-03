package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/demo")
public class DemoController {

    @RequestMapping( "/index" )
    //@PutMapping("index")
   // @ResponseBody//注册验证： 希望返回给前台 一个json字符串 来表示 注册是否成功 而不是 跳转路径  所以此处 方法 加上 @ResponseBody注解 避免被解析成跳转路径
    public String index(){
    	System.out.println(111);
        return "index";
    }
    @RequestMapping(value="/Hello")  
    
    public String HelloWorld(Model model){  
        model.addAttribute("message","Hello World!!!");  
        return "response";  
    }  
}