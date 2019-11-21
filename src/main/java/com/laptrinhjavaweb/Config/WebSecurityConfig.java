package com.laptrinhjavaweb.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN")
//			.antMatchers("/**").hasAnyRole("ADMIN","USER")
				.antMatchers("/**").permitAll().anyRequest().authenticated().and().logout().logoutUrl("/perform_logout") 																														// page
				.logoutSuccessUrl("/home").invalidateHttpSession(true) // xoá hết dữ liệu trên seesion
				.deleteCookies("JSESSIONID") // xoá hết dữ liệu trên cokies.
				.permitAll()

				.and() // kết hợp với đi�?u kiện.

				.formLogin() // thực hiện xác thực qua form(username và password)
				.loginPage("/admin/login") // custom login page
				.loginProcessingUrl("/peform_login") // the url to submit the username and password to
				.defaultSuccessUrl("/admin/home", true) // the landing page after a successful login
				.failureUrl("/admin/login?login_error=true") // the landing page after an unsuccessful login
				.permitAll();
	}

	/**
	 * 2 hàm này để sinh user và password
	 */

	@Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
          .withUser("user1").password(passwordEncoder().encode("user1Pass")).roles("USER")
          .and()
          .withUser("user2").password(passwordEncoder().encode("user2Pass")).roles("USER")
          .and()
          .withUser("admin").password(passwordEncoder().encode("adminPass")).roles("ADMIN");
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

	/*
	 * @Bean public UserDetailsService userDetailsService() {
	 * 
	 * @SuppressWarnings("deprecation") UserDetails user =
	 * User.withDefaultPasswordEncoder().username("user").password("password").roles
	 * ("USER") .build(); return new InMemoryUserDetailsManager(user); }
	 */
}
