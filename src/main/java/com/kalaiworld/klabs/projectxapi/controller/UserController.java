package com.kalaiworld.klabs.projectxapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public interface UserController {

    @GetMapping(value = "/signUp",produces = "application/json")
    public ResponseEntity signUp();

}
