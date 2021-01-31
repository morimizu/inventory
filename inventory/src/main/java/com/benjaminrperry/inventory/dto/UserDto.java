package com.benjaminrperry.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private Long userId;
    private String userName;
    private String email;
}
