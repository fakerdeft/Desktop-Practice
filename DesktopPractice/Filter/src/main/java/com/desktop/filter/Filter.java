package com.desktop.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/first/*")
public class Filter implements jakarta.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 호출...");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 호출...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter 호출...");
        String name = "가공된 이름";
        request.setAttribute("name", name);
        System.out.println(request.getAttribute("name"));
        chain.doFilter(request, response);

        System.out.println("servlet 요청 수행 끝");
    }
}
