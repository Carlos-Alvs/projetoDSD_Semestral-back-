package com.excelcior.bkDate;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class CrossConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registro) {
		registro.addMapping("/**").allowedMethods("*").allowCredentials(false);
	}
	
}
