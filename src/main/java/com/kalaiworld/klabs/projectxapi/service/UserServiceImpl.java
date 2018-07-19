package com.kalaiworld.klabs.projectxapi.service;

import com.kalaiworld.klabs.projectxapi.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public boolean addUser(){
      return true;
    }
}
