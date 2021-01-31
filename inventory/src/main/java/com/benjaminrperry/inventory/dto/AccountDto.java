package com.benjaminrperry.inventory.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AccountDto {
    private final String username;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String password;
}
