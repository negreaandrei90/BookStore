package com.neontodo.BookStore_API.services.implementation;

import com.neontodo.BookStore_API.model.Author;
import com.neontodo.BookStore_API.repositories.AuthorRepository;
import com.neontodo.BookStore_API.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepo;

    @Override
    public Author findAuthorByUuid(UUID uuid) {
        return null;
    }
}
