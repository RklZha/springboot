package com.rkl.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-06 18:34
 * @Description:
 */
public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("MyFilter.doFilter");
		filterChain.doFilter(servletRequest, servletResponse);
	}
}
