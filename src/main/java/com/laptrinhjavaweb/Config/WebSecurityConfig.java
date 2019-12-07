package com.laptrinhjavaweb.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
				.antMatchers("/**")
				.permitAll()
				.antMatchers("/admin/**").access("hasRole('ADMIN')")
				.antMatchers("/login").access("hasRole('ADMIN') or 	hasRole('USER')")
				.and().exceptionHandling().accessDeniedPage("/403")
				.and().formLogin()//
				// Submit URL của trang login
				.loginProcessingUrl("/perform_login") // Submit URL
				.loginPage("/login")
				.defaultSuccessUrl("/home")
				.failureUrl("/login?error=true")
				.usernameParameter("username")
				.passwordParameter("password")
				// Cấu hình cho Logout Page.
				.and().logout()
				.invalidateHttpSession(true)
				.clearAuthentication(true)
				.logoutUrl("/logout").logoutSuccessUrl("/Home")
				.permitAll();
	}

	/**
	 * sử dụng thuật toán bcrypt để mã hóa mật khẩu
	 * 
	 * @return
	 */

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Autowired
	UserDetailsService userDetailsService;

	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
	}

}
