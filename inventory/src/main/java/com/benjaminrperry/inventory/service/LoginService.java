package com.benjaminrperry.inventory.service;

import com.benjaminrperry.inventory.dto.AccountDto;
import com.benjaminrperry.inventory.dto.LoginDto;
import com.benjaminrperry.inventory.dto.UserDto;

public interface LoginService {
    UserDto createAccount(AccountDto account);
    UserDto login(LoginDto login);
}
