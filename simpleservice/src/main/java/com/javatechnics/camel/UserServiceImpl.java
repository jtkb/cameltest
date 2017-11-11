/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.javatechnics.camel;

import com.javatechnics.camel.service.UserService;
import org.apache.aries.blueprint.annotation.Bean;
import org.apache.aries.blueprint.annotation.Service;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * A {@link org.apache.camel.example.rest.User} service which we rest enable from the {@link org.apache.camel.example.rest.UserRouteBuilder}.
 */
@Bean(id = "userService")
@Service(interfaces = {UserService.class})
public class UserServiceImpl implements UserService
{

    // use a tree map so they become sorted
    private final Map<String, User> users = new TreeMap<String, User>();

    public UserServiceImpl()
    {
        users.put("123", new User(123, "John Doe"));
        users.put("456", new User(456, "K-Dog Kutz"));
    }

    /**
     * Gets a user by the given id
     *
     * @return the user, or <tt>null</tt> if no user exists
     * @param id
     */
    @Override
    public User getUser(final String id)
    {
        return users.get(id);
    }

    /**
     * List all users
     *
     * @return the list of all users
     */
    @Override
    public Collection<User> listUsers()
    {
        return users.values();
    }

    /**
     * Updates or creates the given user
     *
     * @param user the user
     */
    @Override
    public void updateUser(User user)
    {
        users.put("" + user.getId(), user);
    }
}
