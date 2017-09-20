package com.share1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yesheng on 2017/9/16.
 */
@RestController
public class UserController {


    @RequestMapping("/")
    public Object test(){
        return "success3";
    }

    @RequestMapping("/project")
    public ModelAndView test2(){
        return new ModelAndView("project");
    }
}
