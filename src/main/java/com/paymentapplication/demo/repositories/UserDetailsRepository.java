package com.paymentapplication.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentapplication.demo.entities.UserDetailsEntity;
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity,Integer> {
	UserDetailsEntity findByUserNameAndPassword(String name,String password);
}