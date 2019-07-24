package com.oracle.service.initService;


import java.io.File;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class InitServlet implements Servlet {


    public void destroy() {
    }


    public ServletConfig getServletConfig() {
        return null;
    }


    public String getServletInfo() {
        return null;
    }


    public void init(ServletConfig config) throws ServletException {
        String path = config.getInitParameter("systemPath");
        System.out.println("ϵͳ��ʼ������OS Path: " + path);
        File file = new File(path);
        if(!file.isDirectory() || !file.exists()) {
            file.mkdirs();
        }
        String tempPath = path+"/temp";
        System.out.println(tempPath);
        File f = new File(tempPath);
        if(!f.isDirectory() || !f.exists()) {
            f.mkdirs();
        }
    }


    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    }

}
