package com.neontodo.BookStore_API.services;

import com.neontodo.BookStore_API.model.User;

import java.util.UUID;

public interface UserService {
    User register(User user);
    User findUserByUuid(UUID uuid);
    //User getCurrentUser();
    User findUserByName(String name);
}
