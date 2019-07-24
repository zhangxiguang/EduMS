package com.oracle.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class GlobalException implements HandlerExceptionResolver {


    public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
                                         Exception arg3) {
        System.out.println("异常类名:" + arg3.getClass().getName());
        System.out.println("异常详细信息:" + arg3.getMessage());

        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:../error.jsp");
        return mav;
    }

}