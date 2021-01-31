package com.benjaminrperry.inventory.service;

import com.benjaminrperry.inventory.converter.UserConverter;
import com.benjaminrperry.inventory.domain.User;
import com.benjaminrperry.inventory.dto.AccountDto;
import com.benjaminrperry.inventory.dto.LoginDto;
import com.benjaminrperry.inventory.dto.UserDto;
import com.benjaminrperry.inventory.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final UserRepository userRepo;

    public UserDto createAccount(AccountDto account) {
        if (!isValid(account)) {
            return new UserDto(-1L, "Account details are not valid", "");
        }
        Optional<User> exists = userRepo.getByUsernameOrEmail(account.getUsername(), account.getEmail());
        if (exists.isPresent()) {
            return new UserDto(-1L, "user already exists", "");
        }
        User user = UserConverter.accountToUser(account);
        user = userRepo.save(user);
        return UserConverter.userToDto(user);
    }
    public UserDto login(LoginDto login) {
        if (!isValid(login)) {
            return new UserDto(-1L, "Login details are not valid", "");
        }
        Optional<User> user = userRepo.getByUsernameOrEmail(login.getIdentifier(), login.getIdentifier());
        if (!user.isPresent()) {
            return new UserDto(-1L, "user credentials are not valid", "");
        }
        return UserConverter.userToDto(user.get());
    }

    private boolean isValid(AccountDto account) {
        return isNullOrEmpty(account.getEmail()) ||
                isNullOrEmpty(account.getUsername()) ||
                isNullOrEmpty(account.getFirstName()) ||
                isNullOrEmpty(account.getLastName()) ||
                isNullOrEmpty(account.getPassword());
    }
        private boolean isValid(LoginDto login) {
            return isNullOrEmpty(login.getIdentifier()) ||
                    isNullOrEmpty(login.getPassword());
        }

    private boolean isNullOrEmpty(String value) {
        return value == null || value.equals("");
    }
}
