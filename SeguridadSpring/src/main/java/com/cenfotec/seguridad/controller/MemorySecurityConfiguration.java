package com.cenfotec.seguridad.controller;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class MemorySecurityConfiguration extends WebsecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	String encodedPassword = new BCryptPasswordEncoder().encode("elian);
	auth.inMemoryAuthentication()ss
	.withUser("elian")
	.password(encodedPassword)
	.roles("manager", "dev")
	.and().passwordEncoder(new BCryptPasswordEncoder());
	}
}
