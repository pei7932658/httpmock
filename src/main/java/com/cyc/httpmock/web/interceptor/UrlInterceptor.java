package com.cyc.httpmock.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UrlInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    log.info(">>>URLInterceptor>>>>>>>在请求处理之前进行调用Controller方法调用之前...");
    // 转发登陆页面
    String urlKey = (String)request.getAttribute("urlKey");
    log.info("拦截器 preHandle 获取的 urlKey:{}", urlKey);
    request.getRequestDispatcher(request.getContextPath() + "/httpmock").forward(request, response);
    return false;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
    ModelAndView modelAndView) throws Exception {
    log.info(">>>URLInterceptor>>>>>>>请求处理之后进行调用，但是在视图被渲染之前Controller方法调用之后...");
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
    throws Exception {
    log.info(">>>URLInterceptor>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行主要是用于进行资源清理工作...");
  }

}
