package com.benjaminrperry.inventory.converter;

import com.benjaminrperry.inventory.domain.FullName;
import com.benjaminrperry.inventory.domain.User;
import com.benjaminrperry.inventory.dto.AccountDto;
import com.benjaminrperry.inventory.dto.UserDto;

public class UserConverter {
    public static UserDto userToDto(User user){
        return new UserDto(user.getUserID(),user.getUsername(),user.getEmail());
    }
    public static User accountToUser(AccountDto account){
        User u = new User();
        u.setUsername(account.getUsername());
        u.setPassword(account.getPassword());
        u.setEmail(account.getEmail());
        FullName name = new FullName();
        name.setFirstName(account.getFirstName());
        name.setLastName(account.getLastName());
        u.setFullName(name);
        return u;
    }
}
