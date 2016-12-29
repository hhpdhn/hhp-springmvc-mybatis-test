package com.manage.sys;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFileter implements Filter {

	@SuppressWarnings("unused")
	private FilterConfig filterConfig;

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.filterConfig = config;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		HttpSession session = req.getSession();
		int indexOf = req.getRequestURI().indexOf("login.htmls");
		if (session.getAttribute("username") != null||indexOf>=0) {
			chain.doFilter(request, response);
		} else {
//			res.sendRedirect("../WEB-INF/views/sys/login.jsp");
			request.getRequestDispatcher("/WEB-INF/views/sys/login.jsp").forward(request, response);
		}

	}

	@Override
	public void destroy() {
		this.filterConfig = null;

	}

}
