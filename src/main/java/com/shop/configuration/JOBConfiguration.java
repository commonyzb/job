package com.shop.configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class JOBConfiguration implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(passportInterceptor);
		//registry.addInterceptor(loginRequiredInterceptor).addPathPatterns("");
		WebMvcConfigurer.super.addInterceptors(registry);
	}
	
}
