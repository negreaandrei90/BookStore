package com.neontodo.BookStore_API.services;

import com.neontodo.BookStore_API.model.Author;

import java.util.UUID;

public interface AuthorService {
    Author findAuthorByUuid(UUID uuid);
}
