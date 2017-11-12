package com.javatechnics.camel.service;


import com.javatechnics.camel.dto.UserDto;

import java.util.Collection;

public interface UserService
{
    UserDto getUser(final String id);

    Collection<UserDto> listUsers();

    void updateUser(UserDto user);
}
