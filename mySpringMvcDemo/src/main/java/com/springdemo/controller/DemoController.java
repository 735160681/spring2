package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/demo")
public class DemoController {

    @RequestMapping( "/index" )
    //@PutMapping("index")
   // @ResponseBody//ע����֤�� ϣ�����ظ�ǰ̨ һ��json�ַ��� ����ʾ ע���Ƿ�ɹ� ������ ��ת·��  ���Դ˴� ���� ���� @ResponseBodyע�� ���ⱻ��������ת·��
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