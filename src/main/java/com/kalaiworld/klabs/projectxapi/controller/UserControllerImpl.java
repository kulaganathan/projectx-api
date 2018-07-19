package com.kalaiworld.klabs.projectxapi.controller;

import com.kalaiworld.klabs.projectxapi.entity.UserEntity;
import com.kalaiworld.klabs.projectxapi.repository.UserRepository;
import com.kalaiworld.klabs.projectxapi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserControllerImpl implements UserController {

  Logger logger = LoggerFactory.getLogger(UserControllerImpl.class);

  @Autowired
  UserService userService;
  @Autowired
  UserRepository userRepository;

  @Override
  public ResponseEntity signUp() {
    UserEntity user=new UserEntity();
    user.setFname("Kalai");
    user.setLname("Selvan");
    user.set_Active(false);
    user.setPassword("1244");
    user.setEmail("123@123.com");
    logger.info("User Email is: "+user.getEmail());
    userRepository.save(user);
    return new ResponseEntity<>(user, HttpStatus.OK);
  }

}