package com.example.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import com.example.domain.User;

import lombok.Data;

@Data
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {
	private final User user;
	
	public LoginUserDetails(User user) {
		super(user.getUsername(), user.getEncodedPassword(), AuthorityUtils.createAuthorityList("USER_ROLE"));
		this.user = user;
	}
 }

