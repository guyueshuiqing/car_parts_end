package com.hq.car_parts.interceptor;

import cn.hutool.core.util.StrUtil;
import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.common.JwtTokenUtil;
import com.hq.car_parts.common.ResultCode;
import com.hq.car_parts.common.exception.ApiException;
import io.jsonwebtoken.Claims;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Component
public class JwtInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");

        String authHeader = request.getHeader(this.tokenHeader); // 获取带token的头部
        System.out.println("authHeader"+"====="+authHeader);
        if (authHeader != null && authHeader.startsWith(this.tokenHead)) {
            String authToken = authHeader.substring(this.tokenHead.length()); //去掉 Bearer
            if(jwtTokenUtil.isTokenExpired(authToken)){
                throw new ApiException(ResultCode.UNAUTHORIZED);
            }
            if(authToken != null){
                request.setAttribute("token",authToken);
            }
            return true;
        }
        throw new ApiException(ResultCode.UNAUTHORIZED);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
    }
}
