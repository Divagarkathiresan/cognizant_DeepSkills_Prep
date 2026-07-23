package com.cognizant.spring_learn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Models.AuthenticationRequest;
import com.cognizant.spring_learn.Models.AuthenticationResponse;
import com.cognizant.spring_learn.utils.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(

            @RequestBody AuthenticationRequest request){

        if(request.getUsername().equals("admin")
                &&
                request.getPassword().equals("pwd")){

            String token=
                    jwtUtil.generateToken(request.getUsername());

            return new AuthenticationResponse(token);

        }

        throw new RuntimeException("Invalid Credentials");

    }

}