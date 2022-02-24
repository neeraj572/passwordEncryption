package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.user.controller.entity.Registration;
import com.user.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepo;
	
	
	PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();

	@Override
	public void saveReg(Registration registration) {
		String encode = passwordEncoder.encode(registration.getPassword());
		registration.setPassword(encode);
		registrationRepo.save(registration);
		
	}

}
