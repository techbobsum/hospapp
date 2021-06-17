package com.bobsumsol.hospapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bobsumsol.hospapp.models.User;
import com.bobsumsol.hospapp.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
