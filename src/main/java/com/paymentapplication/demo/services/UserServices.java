package com.paymentapplication.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paymentapplication.demo.entities.UserDetailsEntity;
import com.paymentapplication.demo.repositories.UserDetailsRepository;

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
