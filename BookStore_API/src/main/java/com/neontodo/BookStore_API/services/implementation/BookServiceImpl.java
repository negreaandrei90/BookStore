package com.neontodo.BookStore_API.services.implementation;

import com.neontodo.BookStore_API.model.Author;
import com.neontodo.BookStore_API.model.Book;
import com.neontodo.BookStore_API.model.Category;
import com.neontodo.BookStore_API.repositories.BookRepository;
import com.neontodo.BookStore_API.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepo;

    @Override
    public Book findBookByUuid(UUID uuid) {
        return null;
    }

    @Override
    public List<Book> findBooksByAuthor(Author author) {
        return List.of();
    }

    @Override
    public List<Book> findBooksByCategory(Category category) {
        return List.of();
    }
}
