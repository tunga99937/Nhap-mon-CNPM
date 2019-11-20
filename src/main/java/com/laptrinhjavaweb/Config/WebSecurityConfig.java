package com.laptrinhjavaweb.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests()
			.antMatchers("/admin/login/**","/css/**", "/js/**", "/images/**", "/glyphicons/**", "/admin/login")
			.permitAll()
			.antMatchers("/admin/**").authenticated()
			.and()
			.logout()
            .logoutUrl("/perform_logout")   // href của button logout admin page
            .logoutSuccessUrl("/home")
            .invalidateHttpSession(true) // xoá hết dữ liệu trên seesion
            .deleteCookies("JSESSIONID") // xoá hết dữ liệu trên cokies.
            .permitAll()
            
            .and() // kết hợp với đi�?u kiện.
            
            .formLogin() // thực hiện xác thực qua form(username và password)
            .loginPage("/admin/login") // custom login page
            .loginProcessingUrl("/perform_login") // the url to submit the username and password to
            .defaultSuccessUrl("/admin/home", true) //the landing page after a successful login
            .failureUrl("/admin/login?login_error=true") // the landing page after an unsuccessful login
            .permitAll();
	}
}
