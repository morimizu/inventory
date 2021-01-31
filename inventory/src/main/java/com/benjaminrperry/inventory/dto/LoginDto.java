package com.benjaminrperry.inventory.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class LoginDto {
    private String identifier;
    private String password;
}
