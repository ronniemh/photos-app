package dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.ui.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.ui.model.CreateUserRequestModel;

/**
 * UserController
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Environment env;

    @GetMapping("/status/check")
    public String status() {
        return "working on port: " + env.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequestModel userDetails) {
        return "Create user method is called";
    }

}