package com.macro.mall.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.macro.mall.demo.dto.CommonResult;

/**
 * 页面跳转控制器
 */
@Controller
public class PageController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/crud", method = RequestMethod.GET)
    public String crud() {
        return "crud";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    
    @ResponseBody
    @RequestMapping(value = "/doLogin", method = RequestMethod.GET)
    public CommonResult doLogin() {
        return new CommonResult().success("index");
    }
}
