package com.training.demo.phase1.controller;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.training.demo.phase1.model.Roles;
import com.training.demo.phase1.services.impementation.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private Environment env;

    @PostMapping("/verifyLogin")
    public List<Roles> verifyLogin(@RequestBody Roles r) throws Exception {
       
        
        List<Roles>  result = loginService.verifyLogin(r);
        
        return result;
    }
}
