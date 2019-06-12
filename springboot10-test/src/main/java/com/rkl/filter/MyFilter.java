package com.rkl.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-04-16 19:06
 * @Description:
 */
public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("MyFilter.init");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("MyFilter.doFilter");

		filterChain.doFilter(servletRequest,servletResponse);
	}

	@Override
	public void destroy() {
		System.out.println("MyFilter.destroy");
	}
}
