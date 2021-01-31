package com.benjaminrperry.inventory.controller;

import com.benjaminrperry.inventory.dto.AccountDto;
import com.benjaminrperry.inventory.dto.LoginDto;
import com.benjaminrperry.inventory.dto.UserDto;
import com.benjaminrperry.inventory.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/user")
    public UserDto createAccount(AccountDto account) {
        return loginService.createAccount(account);
    }
    @GetMapping("/login")
    public UserDto login(LoginDto login){
        return loginService.login(login);
    }
}
