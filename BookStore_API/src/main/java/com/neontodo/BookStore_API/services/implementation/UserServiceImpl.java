package com.neontodo.BookStore_API.services.implementation;

import com.neontodo.BookStore_API.model.User;
import com.neontodo.BookStore_API.repositories.UserRepository;
import com.neontodo.BookStore_API.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepo;

    @Override
    public User register(User user) {
        return null;
    }

    @Override
    public User findUserByUuid(UUID uuid) {
        return null;
    }

    @Override
    public User findUserByName(String name) {
        return null;
    }
}
