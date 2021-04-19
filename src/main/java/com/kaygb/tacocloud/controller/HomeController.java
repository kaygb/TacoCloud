package com.kaygb.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // 控制器
public class HomeController {
    @GetMapping("/") // 处理对跟路径“/”的请求
    public String home(){
        return "home"; // 返回视图名称为home的页面
    }
}
