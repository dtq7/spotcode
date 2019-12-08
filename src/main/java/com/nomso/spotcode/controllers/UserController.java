package com.nomso.spotcode.controllers;

import com.nomso.spotcode.model.UserDto;
import com.nomso.spotcode.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * @author ajao temitayo
 */
@RestController
@RequestMapping("api/v1")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    private void registerUser(@RequestBody UserDto userDto, BindingResult fields){
        RestUtils.validate(fields);
        userService.registerUser(userDto);
    }
}
