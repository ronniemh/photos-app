package dev.ronniemoncayo.photoapp.api.account.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping
    public String status(){
        return "running account";
    }
}