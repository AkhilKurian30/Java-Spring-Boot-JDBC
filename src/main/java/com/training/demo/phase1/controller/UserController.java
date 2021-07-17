package com.training.demo.phase1.controller;

import java.util.List;

import com.training.demo.phase1.model.Users;
import com.training.demo.phase1.repositories.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class UserController {


    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/fetch")
    public List<Users> verifyLogin() throws Exception {
        return usersRepository.findAll();
    }
}