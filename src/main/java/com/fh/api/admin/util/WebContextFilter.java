package com.fh.api.admin.util;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Servlet Filter implementation class WebContextFilter
 */
public class WebContextFilter implements Filter {

    /**
     * Default constructor. 
     */
    public WebContextFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//将当前请求和线程进行绑定
		WebContext.setRequset((HttpServletRequest) request);
		try {
			//继续后续的请求
			chain.doFilter(request, response);
		} finally {
			//doFilter方法执行完成后，始终清除当前线程，解除绑定
			WebContext.remove();
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
