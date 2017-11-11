package com.javatechnics.camel.service;


import com.javatechnics.camel.User;

import java.util.Collection;

public interface UserService
{
    User getUser(final String id);

    Collection<User> listUsers();

    void updateUser(User user);
}
