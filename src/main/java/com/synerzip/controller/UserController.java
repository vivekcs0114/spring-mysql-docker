package com.synerzip.controller;

import com.synerzip.model.User;
import com.synerzip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public Iterable<User> Users() {
        return userService.getAllUser();
    }
}
