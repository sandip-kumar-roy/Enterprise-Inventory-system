package com.tirmizee.core.config.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.csrf.InvalidCsrfTokenException;
import org.springframework.security.web.csrf.MissingCsrfTokenException;
import org.springframework.stereotype.Component;

/**
 * @author Pratya Yeekhaday
 *
 */

@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(AccessDeniedHandlerImpl.class);

	private final RedirectStrategy STRATEGY = new DefaultRedirectStrategy();
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		LOGGER.info(accessDeniedException.getMessage());
		
		// HANDLER CSRF TIME OUT
		if (accessDeniedException instanceof MissingCsrfTokenException) {
			// WHEN LOGIN
			if (request.getRequestURI().contains("login")) {
				STRATEGY.sendRedirect(request, response, "/login?error=CSRF Token Timeout Please Try Again");
			} else {
				STRATEGY.sendRedirect(request, response, "/accessdenied");
			}

		} else if(accessDeniedException instanceof InvalidCsrfTokenException ){
			STRATEGY.sendRedirect(request, response, "/accessdenied");
		} else {
			STRATEGY.sendRedirect(request, response, "/accessdenied");
		}
	}

}
