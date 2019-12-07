package com.laptrinhjavaweb.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.RegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration

@EnableWebMvc

@ComponentScan(basePackages = {"com.laptrinhjavaweb"})
public class WebMVCConfig implements WebMvcConfigurer {

	/**
	 * config noi bat dau file jsp
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
//		bean.setPrefix("/webapp/");
		bean.setSuffix(".jsp");
		return bean;
	}
	
	/**
	 * mapping css, js, vendor,..
	 * mapping tempplate folder   
	 * classpath: là thư mục src/main/resources.
	 */
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/Web/**").addResourceLocations("classpath:/META-INF/Web/");
//		registry.addResourceHandler("/css/**").addResourceLocations("file:D:/ecipse-workspace/Project-I/src/main/resources/META-INF/Web/css/");
		
		registry.addResourceHandler("/Image/**").addResourceLocations("classpath:/META-INF/Image/");
//		registry.addResourceHandler("/js/**").addResourceLocations("file:D:/ecipse-workspace/Project-I/src/main/resources/META-INF/Web/js/");
		
//		registry.addResourceHandler("/mail/**").addResourceLocations("classpath:/META-INF/Web/mail/");
//		registry.addResourceHandler("/mail/**").addResourceLocations("file:D:/ecipse-workspace/Project-I/src/main/resources/META-INF/Web/mail/");
		
		registry.addResourceHandler("/Admin/**").addResourceLocations("classpath:/META-INF/Admin/");
//		registry.addResourceHandler("/vendor/**").addResourceLocations("file:D:/ecipse-workspace/Project-I/src/main/resources/META-INF/Web/vendor/");
		
		registry.addResourceHandler("/Login/**").addResourceLocations("classpath:/META-INF/Login/");
		
		registry.addResourceHandler("/error/**").addResourceLocations("classpath:/META-INF/error/");
		
		registry.addResourceHandler("/source/**").addResourceLocations("classpath:/META-INF/source/");
	}
	
	@Bean public RegistrationBean siteMeshFilter() {
		FilterRegistrationBean<SiteMeshConfig> fitler = new FilterRegistrationBean<SiteMeshConfig>();
		fitler.setFilter(new SiteMeshConfig());
		fitler.addUrlPatterns("/*");
		return fitler;
	}

}
