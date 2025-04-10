package com.paymentsapplication.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paymentsapplication.demo.entity.UserDetailsEntity;
import com.paymentsapplication.demo.repositories.UserDetailsRepository;

@Service
public class UserServices {
	@Autowired
	private UserDetailsRepository userRepo;
	public boolean registerUser(UserDetailsEntity userObj) {
		userRepo.save(userObj);
		return true;
	}
	public UserDetailsEntity userValidation(UserDetailsEntity userObj) {
		return userRepo.findByUserNameAndPassword(userObj.getUserName(),userObj.getPassword());
	}
}
