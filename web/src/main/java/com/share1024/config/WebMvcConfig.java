package com.share1024.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by yesheng on 2017/9/19.
 */
//@EnableWebMvc
//@Configuration
//@ComponentScan(basePackages = "com.share1024.controller")
public class WebMvcConfig extends WebMvcConfigurerAdapter {




    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
