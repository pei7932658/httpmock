 package com.cyc.httpmock.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cyc.httpmock.web.interceptor.UrlInterceptor;

/**
  * 自定义配置项类，该类中和存入拦截器、过滤器等配置项信息
  * @author Administrator
  */
 @Configuration
 public class CustemConfigurerAdapter extends WebMvcConfigurerAdapter {

     @Override
     public void addInterceptors(InterceptorRegistry registry) {
         // 将请求拦截器与Path请求路径对应起来并进行注册
         //registry.addInterceptor(new UrlInterceptor()).excludePathPatterns("/dzh/**").addPathPatterns("/**");

//                 .excludePathPatterns("/httpmock")
//                 .excludePathPatterns("/testHttpmock");

     }
 }
